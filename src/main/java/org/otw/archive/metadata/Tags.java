package org.otw.archive.metadata;

public enum Tags {
  RATING_NOT_RATED(9),
  RATING_GENERAL_AUDIENCES(10),
  RATING_TEEN_AND_UP(11),
  RATING_MATURE(12),
  RATING_EXPLICIT(13),

  WARNING_CHOSE_NO_WARNING(14),
  WARNING_NO_WARNINGS_APPLY(16),
  WARNING_VIOLENCE(17),
  WARNING_CHARACTER_DEATH(18),
  WARNING_NON_CON(19),
  WARNING_UNDERAGE(20)
  ;

  private Tags(int n) { value = n; }

  private final int value;
  public int getValue() {
    return value;
  }

  public static Tags valueOf(int id) {
    for (Tags tag : Tags.values()) {
      if (tag.value == id)
        return tag;
    }
    return null;
  }
}
