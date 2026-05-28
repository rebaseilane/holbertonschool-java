/**
 * Factory class responsible for creating PrintJob objects.
 */
public class PrintJobFactory
{
    /**
     * Creates a PrintJob based on print size and configuration.
     *
     * @param size paper size
     * @param totalPages total pages
     * @param colorPages color pages
     * @param isDoubleSided whether double-sided printing is used
     * @return configured PrintJob
     */
    public static PrintJob createPrintJob(PrintSize size,
                                         int totalPages,
                                         int colorPages,
                                         boolean isDoubleSided)
    {
        switch (size)
        {
            case A2:
                if (isDoubleSided)
                {
                    return new PrintJob(totalPages, colorPages, true,
                        0.32, 0.18, 0.32, 0.22);
                }
                return new PrintJob(totalPages, colorPages, false,
                    0.32, 0.18, 0.32, 0.22);

            case A3:
                if (isDoubleSided)
                {
                    return new PrintJob(totalPages, colorPages, true,
                        0.25, 0.15, 0.30, 0.20);
                }
                return new PrintJob(totalPages, colorPages, false,
                    0.25, 0.15, 0.30, 0.20);

            case A4:
                if (isDoubleSided)
                {
                    return new PrintJob(totalPages, colorPages, true,
                        0.20, 0.10, 0.25, 0.15);
                }
                return new PrintJob(totalPages, colorPages, false,
                    0.20, 0.10, 0.25, 0.15);

            default:
                return null;
        }
    }
}
