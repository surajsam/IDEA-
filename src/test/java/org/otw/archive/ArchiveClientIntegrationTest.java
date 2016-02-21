package org.otw.archive;

import org.junit.Assert;
import org.junit.Test;

public class ArchiveClientIntegrationTest {

  ArchiveClient archiveClient = new ArchiveClient();;

  @Test
  public void testConnectToArchive() throws Exception {
    Assert.assertNotEquals(archiveClient.getWorks(), null);
  }

    @Test
  public void filterArchiveResults() throws Exception {
    WorkSearch workSearch = new WorkSearch();
    workSearch.setTitle("The");

    Assert.assertNotEquals(archiveClient.getWorks(workSearch), null);
    Assert.assertNotEquals(archiveClient.getWorks(workSearch).length, 0);
  }

  @Test
  public void getWorkById() throws Exception {
      Work work = archiveClient.getWorkById(2);
      Assert.assertNotEquals(work, null);
  }
}
