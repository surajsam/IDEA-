package org.otw.archive;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.jersey.api.representation.Form;
import org.joda.time.DateTime;

import javax.ws.rs.core.MultivaluedMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.logging.Logger;

public class WorkSearch {

  @JsonIgnore
  private static final Logger logger = Logger.getLogger(WorkSearch.class.getName());

  private String title;
  private Creator creator;

  @JsonProperty("revised_at")
  private DateTime revisedAt;

  @JsonProperty("language_id")
  private String languageId;
  private Boolean complete;
//          :single_chapter,
//          :word_count,
//          :hits,
//          :kudos_count,
//          :bookmarks_count,
//          :comments_count,
//          :pseud_ids,
//          :collection_ids,
//          :tag,
//          :other_tag_names,
//          :filter_ids,
  @JsonProperty("fandom_names")
  private String fandomNames;

//          :fandom_ids,
//          :rating_ids,
//          :category_ids,
//          :warning_ids,
//          :character_names,
//          :character_ids,
//          :relationship_names,
//          :relationship_ids,
//          :freeform_names,
//          :freeform_ids,
//          :sort_column,
//          :sort_direction,
//          :show_restricted,
  private Integer page;

  public MultivaluedMap<String,String> asQueryParams() {
    final MultivaluedMap<String, String> queryParams = new Form();
    final Field[] fields = getClass().getDeclaredFields();
    for (Field field : fields) {
      final boolean accessible = field.isAccessible();
      try {
        field.setAccessible(true);
        final Object value = field.get(this);
        String name = field.getName();

        if (value != null) {
          // Get annotations in case field is ignored or its name is overridden
          Annotation[] annotations = field.getDeclaredAnnotations();
          if (annotations.length > 0) {
            for (Annotation annotation : annotations) {
              if (annotation instanceof JsonIgnore) {
                break;
              }
              else if (annotation instanceof JsonProperty) {
                name = ((JsonProperty) annotation).value();
                queryParams.add(name, value.toString());
              };
            }
          }
          else {
            queryParams.add(name, value.toString());
          }
        }
      }
      catch (IllegalAccessException e) {
        logger.severe("Error accessing a field: " + e.getMessage());
      }
      finally {
        field.setAccessible(accessible);
      }
    }
    return queryParams;
  }

  // Getters and setters


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Creator getCreator() {
    return creator;
  }

  public void setCreator(Creator creator) {
    this.creator = creator;
  }

  public DateTime getRevisedAt() {
    return revisedAt;
  }

  public void setRevisedAt(DateTime revisedAt) {
    this.revisedAt = revisedAt;
  }

  public String getLanguageId() {
    return languageId;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public String getFandomNames() {
    return fandomNames;
  }

  public void setFandomNames(String fandomNames) {
    this.fandomNames = fandomNames;
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }
}
