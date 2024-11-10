package src.util;

public class To
{
    private static int totalColumns = 5;
    private static int totalLines = 7;
    
    public static int index (int line, int column)
    {
        int index = (((line - 1) * totalColumns) + column);
        return index;
    }

    public static int line (int index)
    {
        int line = (index / totalColumns) + 1;
        return line;
    }

    public static int column (int index)
    {
        int column = ((index) % totalColumns) + 1;
        return column;
    }

    public static void test()
    { 
        // Loop para testar cada índice na matriz de tamanho totalLines x totalColumns
        for (int index = 0; index < totalLines * totalColumns; index++)
        { 
            int line = To.line(index);
            int column = To.column(index);
            int seq = To.index(line, column);
            System.out.println("Índice: " + index + " => Linha: " + line + ", Coluna: " + column + ", I: " + seq);
        }
    }
}