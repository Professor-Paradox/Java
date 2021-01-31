package practice;

public class StarPatterns {

    /**
     * Prints *'s in Solid Square shape
     * 
     * @param rows number of rows to print
     */
    public static void solidSquare(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints *_'s as border of Hollow Square shape and __'s as hollow content
     * 
     * @param rows number of rows to print
     */
    public static void hollowSquare(int rows) {
        int padding = 3, stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            System.out.println();
        }
    }

    /**
     * Prints *_'s as border of Hollow Square and __'s as hollow content Prints
     * given padding size inside square
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowSquare(int rows, int padding) {
        int stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            System.out.println();
        }
    }

    /**
     * Prints *'s as border of solid rectangle
     * 
     * @param length  length of rectangle
     * @param breadth breadth of rectangle
     */
    public static void solidRectangle(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints *_'s as rectangle border and __'s as hollow content
     * 
     * @param length  length of rectangle
     * @param breadth breadth of rectangle
     */
    public static void hollowRectangle(int length, int breadth) {
        int padding = 1;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                if (i > padding && j > padding && i < length - padding + 1 && j < breadth - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            System.out.println();
        }
    }

    /**
     * Print's *_'s as border for rectangle and __'s as hollow content. Print's
     * given padding size inside the rectangle
     * 
     * @param length  length of rectangle
     * @param breadth breadth of rectangle
     * @param padding padding size
     */
    public static void hollowRectangle(int length, int breadth, int padding) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                if (i > padding && j > padding && i < length - padding + 1 && j < breadth - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            System.out.println();
        }
    }

    /**
     * Prints *'s as solid triangle(Right angle triangle)
     * 
     * @param rows number of rows to print
     */
    public static void solidRightTriangle(int rows) {
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of triangle and _'s as hollow content
     * 
     * @param rows number of rows to print
     */
    public static void hollowRightTriangle(int rows) {
        int stars = 1, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of triangle and _'s as hollow content Print's given
     * padding size inside triangle
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowRightTriangle(int rows, int padding) {
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as a Reversed or Downward Triangle
     * 
     * @param rows number of rows to print
     */
    public static void solidDownwardRightTriangle(int rows) {
        int stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of downward triangle and _'s as hollow content
     * 
     * @param rows number of rows to print
     */
    public static void hollowDownwardRightTriangle(int rows) {
        int stars = rows, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of downward triangle and _'s as hollow content Print's
     * given padding size inside downward triangle
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowDownwardRightTriangle(int rows, int padding) {
        int stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as a mirrored triangle i.e right angle triangle starting from
     * right to left Print's _'s to space the triangle from left of screen
     * 
     * @param rows number of rows to print
     */
    public static void solidMirroredRightTriangle(int rows) {
        int stars = 1, spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of Mirrored Triangle and _'s for hollow content and
     * spacing of triangle.
     * 
     * @param rows number of rows to print
     */
    public static void hollowMirroredRightTriangle(int rows) {
        int stars = 1, spaces = rows - 1, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of mirrored triangle _'s as hollow content and spacing
     * for triangle Print's given padding size inside mirrored triangle
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowMirroredRightTriangle(int rows, int padding) {
        {
            int stars = 1, spaces = rows - 1;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("_");
                }
                for (int j = 1; j <= stars; j++) {
                    if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                        System.out.print("_");
                    else
                        System.out.print("*");
                }
                stars++;
                spaces--;
                System.out.println();
            }
        }
    }

    /**
     * Print's *'s as downward Mirrored triangle,i.e reverses of mirrored triangle
     * Print's _'s as space from left
     * 
     * @param rows number of rows to print
     */
    public static void solidDownwardMirroredTriangle(int rows) {
        int stars = rows, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars--;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border for downward mirrored triangle and _'s as hollow
     * content and spacing from left
     * 
     * @param rows number of rows to print
     */
    public static void hollowDownwardMirroredTriangle(int rows) {
        int stars = rows, spaces = 0, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars--;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border for downward mirrored triangle and _'s as hollow
     * content and spacing from left Print's given padding size inside downward
     * mirrored triangle
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowDownwardMirroredTriangle(int rows, int padding) {
        int stars = rows, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars--;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as right pascal triangle i.e combination of right triangle and
     * downward triangle
     * 
     * @param rows number of rows to print
     */
    public static void solidRightPascalTriangle(int rows) {
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= rows / 2)
                stars++;
            else
                stars--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border for pascal triangle and _'s as hollow content
     * 
     * @param rows number of rows to print
     */
    public static void hollowRightPascalTriangle(int rows) {
        int stars = 1, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && i < rows - padding + 1 && j > padding && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            if (i <= rows / 2)
                stars++;
            else
                stars--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of pascal triangle and _'s hollow content Print's given
     * padding size inside pascal triangle
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowRightPascalTriangle(int rows, int padding) {
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && i < rows - padding + 1 && j > padding && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            if (i <= rows / 2)
                stars++;
            else
                stars--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as Mirrored pascal triangle i.e triangle moves from right to left
     * Print's _'s as spacing from left
     * 
     * @param rows number of rows to print
     */
    public static void solidMirroredPascalTriangle(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = 1, spaces = rows / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= rows / 2) {
                stars++;
                spaces--;
            } else {
                stars--;
                spaces++;
            }
            System.out.println();
        }
    }

    /**
     * Print's *'s as border for mirrored pascal triangle and _'s as hollow content
     * and spacing from left
     * 
     * @param rows number of rows to print
     */
    public static void hollowMirroredPascalTriangle(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = 1, spaces = rows / 2, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && i < rows - padding + 1 && j > padding && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            if (i <= rows / 2) {
                stars++;
                spaces--;
            } else {
                spaces++;
                stars--;
            }
            System.out.println();
        }
    }

    /**
     * Print's *'s as border for mirrored pascal triangle and _'s hollow content and
     * spacing from left Print's given padding size inside the mirrored pascal
     * triangle
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowMirroredPascalTriangle(int rows, int padding) {
        if (rows % 2 == 0)
            rows++;
        int stars = 1, spaces = rows / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && i < rows - padding + 1 && j > padding && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            if (i <= rows / 2) {
                stars++;
                spaces--;
            } else {
                spaces++;
                stars--;
            }
            System.out.println();
        }
    }

    /**
     * Print's *'s as odd Triangle i.e 1* 3* 5* 7* so on... on each row
     * 
     * @param rows number of rows to print
     */
    public static void solidOddRightTriangle(int rows) {
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars += 2;
            System.out.println();
        }
    }

    /**
     * Print's *'s border of odd triangle and _'s as hollow content
     * 
     * @param rows number of rows to print
     */
    public static void hollowOddRightTriangle(int rows) {
        int stars = 1, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars += 2;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of odd triangle and _'s as hollow content
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowOddRightTriangle(int rows, int padding) {
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars += 2;
            System.out.println();
        }
    }

    /**
     * Print's *'s as downward odd triangle,i.e each new line has odd number of
     * stars only _'s are used to space from left
     * 
     * @param rows number of rows to print
     */
    public static void solidOddDownwardRightTriangle(int rows) {
        int stars = rows * 2 - 1, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars -= 2;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of odd downward triangle and _'s as hollow content and
     * space from left
     * 
     * @param rows number of rows to print
     */
    public static void hollowOddDownwardRightTraingle(int rows) {
        int spaces = 0, stars = rows * 2 - 1, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            spaces++;
            stars -= 2;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border for odd downward triangle,_'s as hollow content and
     * spaces from left Print's given padding size inside the downward triangle
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowOddDownwardRightTraingle(int rows, int padding) {
        int spaces = 0, stars = rows * 2 - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars -= 2;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s in odd pyramid i.e rows contain 1,3,5,7,.. odd number stars
     * Print's _'s as space from left
     * 
     * @param rows number of rows to print
     */
    public static void solidOddPyramid(int rows) {
        int stars = 1, spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            stars += 2;
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of odd pyramid and _'s as hollow content and space from
     * left
     * 
     * @param rows number of rows to print
     */
    public static void hollowOddPyramid(int rows) {
        int stars = 1, spaces = rows - 1, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars += 2;
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *'s on border of Odd Pyramid and _'s as hollow content and spacing
     * from left. Print's given padding size inside the Odd Pyramid
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowOddPyramid(int rows, int padding) {
        int stars = 1, spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            stars += 2;
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *_'s as Pyramid shape i.e similar to mirrored triangle with extra
     * _'s. Print's *_'s to achieve pyramid effect and _'s as space to pyramid
     * 
     * @param rows number of rows to print
     */
    public static void solidPyramid(int rows) {
        int stars = 1, spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*_");
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *_'s as border of pyramid and __'s as hollow content and _'s as space
     * from left.
     * 
     * @param rows number of rows to print
     */
    public static void hollowPyramid(int rows) {
        int stars = 1, spaces = rows - 1, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *_'s as border of Pyramid and __'s as hollow content and _'s as space
     * from left Print's give padding size inside the pyramid
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowPyramid(int rows, int padding) {
        {
            int stars = 1, spaces = rows - 1;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("_");
                }
                for (int j = 1; j <= stars; j++) {
                    if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                        System.out.print("__");
                    else
                        System.out.print("*_");
                }
                stars++;
                spaces--;
                System.out.println();
            }
        }
    }

    /**
     * Print's *_'s as downward pyramid i.e pyramid in upside direction, _'s as
     * space from left
     * 
     * @param rows number of rows to print
     */
    public static void solidDownwardPyramid(int rows) {
        int stars = rows, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*_");
            }
            stars--;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *_'s as border of downward pyramid and __'s as hollow content and _'s
     * as space from left
     * 
     * @param rows number of rows to print
     */
    public static void hollowDownwardPyramid(int rows) {
        int stars = rows, spaces = 0, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            stars--;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *_'s as border of downward pyramid and __'s as hollow content and _'s
     * as space from left Print's given padding size inside downward pyramid
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowDownwardPyramid(int rows, int padding) {
        int stars = rows, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < stars - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            stars--;
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *_'s as solid diamond.i.e combination of pyramid and downward pyramid
     * Print's _'s as space from left
     * 
     * @param rows number of rows to print
     */
    public static void solidDiamond(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = 1, spaces = rows / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*_");
            }
            if (i <= rows / 2) {
                stars++;
                spaces--;
            } else {
                stars--;
                spaces++;
            }
            System.out.println();
        }
    }

    /**
     * Print's *_'s as border of diamond and __'s for hollow content and _'s for
     * space from left
     * 
     * @param rows number of rows to print
     */
    public static void hollowDiamond(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = 1, spaces = rows / 2, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && i < rows - padding + 1 && j > padding && j < stars - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            if (i <= rows / 2) {
                stars++;
                spaces--;
            } else {
                spaces++;
                stars--;
            }
            System.out.println();
        }
    }

    /**
     * Print's *_'s border of diamond and __'s for hollow content and _'s for space
     * from left Print's given padding size inside diamond
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowDiamond(int rows, int padding) {
        if (rows % 2 == 0)
            rows++;
        int stars = 1, spaces = rows / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && i < rows - padding + 1 && j > padding && j < stars - padding + 1)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            if (i <= rows / 2) {
                stars++;
                spaces--;
            } else {
                spaces++;
                stars--;
            }
            System.out.println();
        }
    }

    /**
     * Print's *'s as cross ladder,i.e step by step like a ladder Print's _'s as
     * spaces from left
     * 
     * @param rows number of rows to print
     */
    public static void solidCrossLadder(int rows) {
        int spaces = 0, stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of cross ladder and _'s as hollow data and space from
     * left
     * 
     * @param rows number of rows to print
     */
    public static void hollowCrossLadder(int rows) {
        int spaces = 0, stars = rows, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < rows - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of cross ladder and _'s as hollow content and space
     * from left Print's given padding size inside the cross ladder
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowCrossLadder(int rows, int padding) {
        int spaces = 0, stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < rows - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
    }

    /**
     * Print's *'s as Cross ladder mirror starting from right moving to left Print's
     * _'s as space from left
     * 
     * @param rows number of rows to print
     */
    public static void solidMirroredCrossLadder(int rows) {
        int spaces = rows - 1, stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of Mirrored Cross ladder and _'s as hollow content and
     * spacing from left
     * 
     * @param rows number of rows to print
     */
    public static void hollowMirroredCrossLadder(int rows) {
        int spaces = rows - 1, stars = rows, padding = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < rows - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as border of Mirrored Cross ladder and _'s as hollow content and
     * spacing from left Print's padding size inside the Mirrored Cross Ladder
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowMirroredCrossLadder(int rows, int padding) {
        int spaces = rows - 1, stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > padding && j > padding && i < rows - padding + 1 && j < rows - padding + 1)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            spaces--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as a plus sign(+),_'s as hollow content
     * 
     * @param rows number of rows to print
     */
    public static void plusSign(int rows) {
        if (rows % 2 == 0)
            rows++;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == rows / 2 + 1 || i == rows / 2 + 1)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }

    /**
     * Print's *'s as a backslash(\) symbol,__'s as hollow content
     * 
     * @param rows number of rows to print
     */
    public static void backSlashSign(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("__");
            }
            System.out.println();
        }
    }

    /**
     * Print's *'s as a slash sign(/) from right to left Print's __'s as hollow
     * content and space to left
     * 
     * @param rows number of rows to print
     */
    public static void slashSign(int rows) {
        int spaces = rows - 1, stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("__");
            }
            for (int j = 1; j <= stars; j++) {
                if (j == 1)
                    System.out.print("*");
                else
                    System.out.print("__");
            }
            spaces--;
            stars++;
            System.out.println();
        }
    }

    /**
     * print's *_'s as letter X, __'s are used to provide padding This is displayed
     * by removing data from grid,easy way.
     * 
     * @param rows number of rows to print
     */
    public static void xCharacter(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i == j || i == rows - j + 1)
                    System.out.print("*_");
                else
                    System.out.print("__");
            }
            System.out.println();
        }
    }

    /**
     * print's *_'s as letter V, __'s are used as internal data of pyramid
     * 
     * @param rows number of rows to print
     */
    public static void vCharacter(int rows) {
        int spaces = 0, stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (j > 1 && j < stars) {
                    System.out.print("__");
                } else {
                    System.out.print("*_");
                }
            }
            stars--;
            spaces++;
            System.out.println();
        }
    }

    /**
     * print's *_'s as reverse V,__'s are used as internal data of pyramid
     * 
     * @param rows number of rows to print
     */
    public static void reverseVCharacter(int rows) {
        int spaces = rows - 1, stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (j > 1 && j < stars) {
                    System.out.print("__");
                } else {
                    System.out.print("*_");
                }
            }
            stars++;
            spaces--;
            System.out.println();
        }
    }

    /**
     * print's *'s as lambda symbol,_'s are used as internal data of Triangle
     * 
     * @param rows number of rows to print
     */
    public static void lambdaSign(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                // taking total of * position for easy printing
                if (i == j || i + j == rows + 1) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            stars++;
            System.out.println();
        }
    }

    /**
     * print's *'s as letter Y,_'s are used as internal data of Triangle
     * 
     * @param rows number of rows to print
     */
    public static void yCharacter(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if (i == j || i + j == rows + 1) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            stars--;
            System.out.println();
        }
    }

    /**
     * Print's *'s as data in butterflyPascal and _'s as hollow data. This is done
     * by removing extra *'s from a grid easy way
     * 
     * @param rows number of rows to print
     */
    public static void butterflyPascal(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                if ((j > i && j <= rows - i) || (j < i && j > rows - i + 1))
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * print's *'s as an open mouth triangle,i.e as pacman mouth. combination of
     * downward triangle and right triangle.
     * 
     * @param rows number of rows to print
     */
    public static void openMouthTriangle(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows / 2 + 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= rows / 2) {
                stars--;
            } else {
                stars++;
            }
            System.out.println();
        }
    }

    /**
     * print's *'s as Mirrored open mouth,_'s are used for padding. combination of
     * mirrored downward right triangle and mirrored right triangle.
     * 
     * @param rows number of rows to print
     */
    public static void mirroredOpenMouthTriangle(int rows) {
        if (rows % 2 == 0)
            rows++;
        int spaces = 0, stars = rows / 2 + 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i < rows / 2 + 1) {
                stars--;
                spaces++;
            } else {
                stars++;
                spaces--;
            }
            System.out.println();
        }
    }

    /**
     * print's *'s as left side of rectangle,__'s as middle data,*'s as right side
     * of rectangle
     * 
     * @param rows number of rows to print
     */
    public static void hollowDiamondInRectangle(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows / 2 + 1, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("__");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            if (i <= rows / 2) {
                stars--;
                spaces++;
            } else {
                stars++;
                spaces--;
            }
            System.out.println();
        }
    }

    /**
     * print's *_'s as sand glass pyramid,i.e combination of downward pyramid and
     * pyramid. _'s are used for left padding.
     * 
     * @param rows number of rows to print
     */
    public static void solidSandGlassPyramid(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows / 2 + 1, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*_");
            }
            if (i < rows / 2 + 1) {
                stars--;
                spaces++;
            } else {
                stars++;
                spaces--;
            }
            System.out.println();
        }
    }

    /**
     * print's *_'s as sand glass pyramid,i.e combination of hollow downward pyramid
     * and hollow pyramid. _'s are used for left padding.__'s as internal padding.
     * 
     * @param rows number of rows to print
     */
    public static void hollowSandGlassPyramid(int rows) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows / 2 + 1, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if (j > 1 && j < stars && i > 1 && i < rows)
                    System.out.print("__");
                else
                    System.out.print("*_");
            }
            if (i < rows / 2 + 1) {
                stars--;
                spaces++;
            } else {
                stars++;
                spaces--;
            }
            System.out.println();
        }
    }

    /**
     * print's *_'s as sand glass pyramid,i.e combination of hollow downward pyramid
     * padding and hollow pyramid padding. _'s as left padding.__'s as internal
     * padding.
     * 
     * @param rows    number of rows to print
     * @param padding padding size
     */
    public static void hollowSandGlassPyramid(int rows, int padding) {
        if (rows % 2 == 0)
            rows++;
        int stars = rows / 2 + 1, spaces = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= stars; j++) {
                if ((i > padding && i < rows - padding + 1) && (j > padding && j < stars - padding + 1)) {
                    System.out.print("__");
                } else {
                    System.out.print("*_");
                }
            }
            if (i < rows / 2 + 1) {
                stars--;
                spaces++;
            } else {
                stars++;
                spaces--;
            }
            System.out.println();
        }
    }
}
