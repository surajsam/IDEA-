package com.eburrows.openshift;

import org.transformativeworks.archive.ArchiveClient;
import org.transformativeworks.archive.Work;
import org.transformativeworks.archive.WorkSearch;
import org.transformativeworks.archive.metadata.Tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArchiveBean {

  private ArchiveClient archiveClient = new ArchiveClient();
  private Work[] works;
  private Tags tags;

  public Work[] getWorks() throws IOException {
    works = archiveClient.getWorks();
    return works;
  }
  public Work[] getWorks(Integer page) throws IOException {
    if (page == 0) page = 1;
    WorkSearch workSearch = new WorkSearch();
    workSearch.setPage(page);
    works = archiveClient.getWorks(workSearch);
    return works;
  }

  // Works by fandom
  public Work[] getWorksByFandom(String fandom) throws IOException {
    return getWorksByFandom(fandom, 1);
  }
  public Work[] getWorksByFandom(String fandom, Integer page) throws IOException {
    if (page == 0) page = 1;
    WorkSearch workSearch = new WorkSearch();
    workSearch.setFandomNames(fandom);
    workSearch.setPage(page);
    works = archiveClient.getWorks(workSearch);
    return works;
  }

  public Work getWork(Integer id) {
    return new ArchiveClient().getWorkById(id);
  }

  public String formatDate(Date date) {
    return new SimpleDateFormat("dd MMM yyyy").format(date);
  }

  public String classForRating(int id) {
    Tags tag = Tags.valueOf(id);
    switch (tag) {
      case RATING_NOT_RATED:
        return "default";
      case RATING_GENERAL_AUDIENCES:
        return "success";
      case RATING_TEEN_AND_UP:
        return "info";
      case RATING_MATURE:
        return "warning";
      case RATING_EXPLICIT:
        return "danger";
    }
    return "";
  }

  public String classForWarning(int id) {
    Tags tag = Tags.valueOf(id);
    switch (tag) {
      case WARNING_CHOSE_NO_WARNING:
        return "default";
      case WARNING_NO_WARNINGS_APPLY:
        return "success";
      case WARNING_VIOLENCE:
      case WARNING_CHARACTER_DEATH:
      case WARNING_NON_CON:
      case WARNING_UNDERAGE:
        return "danger";
    }
    return "";
  }
}
