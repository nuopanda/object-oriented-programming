package problem3;

/**
 * Represents a class TechnicalReport as with their details--title, author, year, trid,
 * institution.
 *
 * @author nikkiwang
 */
public class TechnicalReport extends AbstractPublication {

  private String title;
  private Author author;
  private int year;
  private int trid;
  private String institution;

  /**
   * Construct a technicalreport object.
   *
   * @param title -- techical report's title
   * @param author -- techical report's author
   * @param year -- techical report's year
   * @param trid -- techical report's TR-ID
   * @param institution -- techical report's institution
   */
  public TechnicalReport(String title, Author author, int year, int trid, String institution) {
    super(title, author, year);
    this.trid = trid;
    this.institution = institution;
  }

  /**
   * Get TR-ID.
   *
   * @return TR-ID
   */
  public int getTrid() {
    return this.trid;
  }

  /**
   * Set TR-ID.
   *
   * @param trid - TR-ID
   */
  public void setTrid(int trid) {
    this.trid = trid;
  }

  /**
   * Get institution.
   *
   * @return institution
   */
  public String getInstitution() {
    return this.institution;
  }

  /**
   * Set institution.
   */
  public void setInstitution(String institution) {
    this.institution = institution;
  }

  /**
   * Create a journal object.
   *
   * @param issue -- journal's issue
   * @param month -- journal's month
   * @param year -- journal's year
   * @return new Journal object
   */
  public Journal createJournal(String journalName, int issue, Month month, int year) {
    Journal journal = new Journal(this.getTitle(), this.getAuthor(), journalName, issue, month,
        year);
    return journal;
  }

}
