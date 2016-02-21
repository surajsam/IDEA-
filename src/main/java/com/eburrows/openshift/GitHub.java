package com.eburrows.openshift;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

public class GitHub
{
  List<Repository> repos = new ArrayList<Repository>();
  
  public GitHub() throws IOException
  {
    // Set up a connection to Github
    RepositoryService service = new RepositoryService();

    // Get only the repositories that I manage myself
    try
    {
      for (Repository repo : service.getRepositories("emma-burrows"))
      {
        if (!repo.isFork())
          repos.add(repo);
      }
    }
    catch (IOException e)
    {
      throw new IOException("GitHub.getRepositories experienced an input/output exception when trying to get the repositories.");
    }
  }

  public List<Repository> getRepositories()
  {
    return this.repos;
  }
}
