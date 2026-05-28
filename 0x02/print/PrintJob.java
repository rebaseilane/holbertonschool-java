/**
 * Class representing a print job and its pricing logic.
 */
public class PrintJob
{
    private int totalPages;
    private int colorPages;
    private boolean isDoubleSided;

    private double colorDoubleSidedCost;
    private double bwDoubleSidedCost;
    private double colorSingleSidedCost;
    private double bwSingleSidedCost;

    /**
     * Constructor for PrintJob.
     *
     * @param totalPages total number of pages
     * @param colorPages number of color pages
     * @param isDoubleSided whether printing is double-sided
     * @param colorDoubleSidedCost cost per color page (double-sided)
     * @param bwDoubleSidedCost cost per black-and-white page (double-sided)
     * @param colorSingleSidedCost cost per color page (single-sided)
     * @param bwSingleSidedCost cost per black-and-white page (single-sided)
     */
    public PrintJob(int totalPages,
                    int colorPages,
                    boolean isDoubleSided,
                    double colorDoubleSidedCost,
                    double bwDoubleSidedCost,
                    double colorSingleSidedCost,
                    double bwSingleSidedCost)
    {
        this.totalPages = totalPages;
        this.colorPages = colorPages;
        this.isDoubleSided = isDoubleSided;
        this.colorDoubleSidedCost = colorDoubleSidedCost;
        this.bwDoubleSidedCost = bwDoubleSidedCost;
        this.colorSingleSidedCost = colorSingleSidedCost;
        this.bwSingleSidedCost = bwSingleSidedCost;
    }

    /**
     * Calculates total cost of print job.
     *
     * @return total cost
     */
    public double calculateTotal()
    {
        int bwPages = this.totalPages - this.colorPages;

        if (this.isDoubleSided)
        {
            return (this.colorPages * this.colorDoubleSidedCost)
                + (bwPages * this.bwDoubleSidedCost);
        }

        return (this.colorPages * this.colorSingleSidedCost)
            + (bwPages * this.bwSingleSidedCost);
    }

    /**
     * Returns formatted string of print job details.
     *
     * @return formatted output
     */
    @Override
    public String toString()
    {
        String type = this.isDoubleSided ? "double-sided" : "single-sided";

        return "total pages: " + this.totalPages
            + ", color pages: " + this.colorPages
            + ", black-and-white pages: " + (this.totalPages - this.colorPages)
            + ", " + type
            + ". total: $" + String.format("%.2f", calculateTotal());
    }
}
