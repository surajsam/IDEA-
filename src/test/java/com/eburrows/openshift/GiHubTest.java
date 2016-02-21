package com.eburrows.openshift;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;

import org.eclipse.egit.github.core.Repository;
import org.junit.Test;

public class GiHubTest
{
  @Test
  public void testGetRepositories()
  {
    GitHub gh;
    try
    {
      gh = new GitHub();
      List<Repository> results = gh.getRepositories();

      Assert.assertEquals(results.get(0).getOwner().getLogin(), "emma-burrows");
    }
    catch (IOException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
