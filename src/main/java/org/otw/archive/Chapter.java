package org.otw.archive;

import java.util.Date;

public class Chapter {
  private String title;
  private Integer position;
  private String summary;
  private String notes;
  private String endnotes;
  private Date published_at;
  private String content;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
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

  public Date getPublished_at() {
    return published_at;
  }

  public void setPublished_at(Date published_at) {
    this.published_at = published_at;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
