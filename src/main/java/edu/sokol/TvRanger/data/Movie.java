package edu.sokol.TvRanger.data;

import java.util.List;

public class Movie {
  private String title;
  private String description;
  private Integer duration;
  private List<String> people;
  private Integer year;
  
  /**
   * Get title.
   *
   * @return title as String.
   */
  public String getTitle()
  {
      return title;
  }
  
  /**
   * Set title.
   *
   * @param title the value to set.
   */
  public void setTitle(String title)
  {
      this.title = title;
  }
  
  /**
   * Get description.
   *
   * @return description as String.
   */
  public String getDescription()
  {
      return description;
  }
  
  /**
   * Set description.
   *
   * @param description the value to set.
   */
  public void setDescription(String description)
  {
      this.description = description;
  }
  
  /**
   * Get duration.
   *
   * @return duration as Integer.
   */
  public Integer getDuration()
  {
      return duration;
  }
  
  /**
   * Set duration.
   *
   * @param duration the value to set.
   */
  public void setDuration(Integer duration)
  {
      this.duration = duration;
  }

  /**
   * Get people.
   *
   * @return people as List<String>.
   */
  public List<String> getPepole()
  {
      return people;
  }

  /**
   * Set people.
   *
   * @param people the value to set.
   */
  public void setPeople(List<String> people)
  {
    this.people = people;
  }
  
  /**
   * Get year.
   *
   * @return year as Integer.
   */
  public Integer getYear()
  {
      return year;
  }
  
  /**
   * Set year.
   *
   * @param year the value to set.
   */
  public void setYear(Integer year)
  {
      this.year = year;
  }
}
