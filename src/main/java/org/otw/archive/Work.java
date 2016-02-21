package org.otw.archive;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.otw.archive.metadata.*;
import org.otw.archive.metadata.Character;

import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class Work {
  @JsonIgnore
  private static final Logger logger = Logger.getLogger(WorkSearch.class.getName());

  private long id;
  private String title;
  private String summary;
  private String notes;
  private String endnotes;
  private boolean complete;
  private boolean restricted;

  @JsonProperty("revised_at")
  private Date revisedAt;

  @JsonProperty("word_count")
  private long wordCount;
  private URL url;

  @JsonProperty("comment_url")
  private URL commentUrl;

  private Rating[] ratings;
  private Warning[] warnings;
  private Fandom[] fandoms;
  private Character[] characters;
  private Category[] categories;
  @JsonProperty("additional_tags")
  private AdditionalTag[] additionalTags;

  private List<Creator> creators;

  private List<Chapter> chapters;


  // Getters and Setters

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getEndnotes() {
    return endnotes;
  }

  public void setEndnotes(String endnotes) {
    this.endnotes = endnotes;
  }

  public boolean isComplete() {
    return complete;
  }

  public void setComplete(boolean complete) {
    this.complete = complete;
  }

  public boolean isRestricted() {
    return restricted;
  }

  public void setRestricted(boolean restricted) {
    this.restricted = restricted;
  }

  public Date getRevisedAt() {
    return revisedAt;
  }

  public void setRevisedAt(Date revisedAt) {
    this.revisedAt = revisedAt;
  }

  public long getWordCount() {
    return wordCount;
  }

  public void setWordCount(long wordCount) {
    this.wordCount = wordCount;
  }

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }

  public URL getCommentUrl() {
    return commentUrl;
  }

  public void setCommentUrl(URL commentUrl) {
    this.commentUrl = commentUrl;
  }

  public Rating[] getRatings() {
    return ratings;
  }

  public void setRatings(Rating[] ratings) {
    this.ratings = ratings;
  }

  public Warning[] getWarnings() {
    return warnings;
  }

  public void setWarnings(Warning[] warnings) {
    this.warnings = warnings;
  }

  public Fandom[] getFandoms() {
    return fandoms;
  }

  public void setFandoms(Fandom[] fandoms) {
    this.fandoms = fandoms;
  }

  public Character[] getCharacters() {
    return characters;
  }

  public void setCharacters(Character[] characters) {
    this.characters = characters;
  }

  public Category[] getCategories() {
    return categories;
  }

  public void setCategories(Category[] categories) {
    this.categories = categories;
  }

  public AdditionalTag[] getAdditionalTags() {
    return additionalTags;
  }

  public void setAdditionalTags(AdditionalTag[] additionalTags) {
    this.additionalTags = additionalTags;
  }

  public List<Creator> getCreators() {
    return creators;
  }

  public void setCreators(List<Creator> creators) {
    this.creators = creators;
  }

  public List<Chapter> getChapters() {
    return chapters;
  }

  public void setChapters(List<Chapter> chapters) {
    this.chapters = chapters;
  }
}
