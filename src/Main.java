import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        double startTime;

//        startTime = System.nanoTime();

        String filePath = "C:\\Users\\User\\IdeaProjects\\CorrectionCustomLensDistortion\\src\\IMG_20211011_170030.jpg";
        File file = new File(filePath);
        BufferedImage bufferedImage = ImageIO.read(file);

//        System.out.println((System.nanoTime() - startTime) / 1000000000 + " s");

        String[] xString = "1333.5729260965202 1339.0150219510606 1344.368581396939 1349.5065651964494 1354.3589243157612 1359.7192959501942 1365.177486589942 1370.874980097076 1376.4924853541124 1381.9974406916274 1386.8648426422776 1392.0920935301756 1397.8196483705065 1403.7152788928247 1409.500758187445 1415.1442110387552 1420.20887815196 1425.792795721826 1431.5588384197736 1437.3469521301956 1443.3836044774093 1449.0503275140939 1454.5229128459446 1460.5218925805061 1466.8708063233594 1473.2650180751882 1479.1273276574855 1484.8256225747887 1491.0243854852126 1497.663732056702 1504.4787566874231 1510.9541787907297 1517.1698395389062 1523.3420846820625 1529.3205753142915 1535.383843963986 1541.7424662051585 1548.4407785881524 1555.1872501803962 1561.941373279832 1568.2444283444208 1574.60181552538 1581.2514335938808 1588.059983599735 1594.9028523861105 1601.8414246489924 1608.420920422673 1614.8239390890199 1621.2964515807769 1628.0881744746719 1634.7640035556958 1641.3270245449212 1647.5060912798733 1652.9874063380728 1657.980394112343 1663.1809397817603 1668.2081907908675 1672.993744575066 1677.4629728742736 1681.5499434495573 1685.1128466616242 1689.2140957850406 1693.219286693303 1697.1024825395857 1700.718483150176 1703.9734399290453 1706.9165859040625 1710.4147197517482 1714.0751475106106 1717.4865939554822 1720.9115300270153 1723.823150776939 1726.6785303356494 1729.9429621619272 1733.0800587866333 1736.2494916093747 1738.9764711499822 1741.521001469766 1744.2341165547468 1747.0699665182638 1749.934202782987 1752.6532661680994 1755.2926670048548 1757.91894621441 1760.3392419283707 1762.5791553010772 1764.8411836969833 1767.194831966526 1769.6087523750768 1772.0560032298451 1774.494816527082 1776.9391174360828 1779.2573351264648 1781.5926677161845 1783.8579942257002 1786.2132849362515 1788.3236015065381 1790.3557861739969 1792.3062853887195 1794.2433601982577 1796.2413424102187 1798.3813604575155 1800.43315609581 1802.544284520097 1804.637519621311 1806.664772311297 1808.6942417086657 1810.6979841272682 1812.721520456046 1814.597672257484 1816.5314243178561 1818.4968214629023 1820.5049161419968 1822.4443752989105 1824.4593785397074 1826.47403151065 1828.469717119896 1830.5310755981043 1832.6737080612968 1834.8036032268244 1837.0184287469367 1839.0949964621402 1841.313391057588 1843.3615580777798 1845.465405883611 1847.6729910534336 1849.8520769383338 1852.0476952159509 1854.1670462207346 1856.2615773891423 1858.38491165556 1860.359802515488 1862.453627946161 1864.5696370865126 1866.7254921955798 1868.967529490817 1871.2013131547315 1873.207641483476 1875.3061605179685 1877.33938959759 1879.4054085324703 1881.4123510236968 1883.3452249053898 1885.373941486845 1887.329506743938 1889.5187368043648 1891.6018234650408 1893.7192072066491 1895.7417335438317 1897.9350564163835 1900.1175506185632 1902.2955583507355 1904.5633177447091 1906.9149301259683 1909.261050349922 1911.6065922675634 1914.1410499143371 1916.6552415175836 1919.2491361507987 1921.9138419580943 1924.6513813586314 1927.4628754026442 1930.3485803459514 1933.3080711855464 1936.3405555157128 1939.4453356149409 1942.6224366739316 1945.8734190749663 1949.2023926329216 1952.6172507082174 1956.1311421019695 1959.764198643636 1963.5455363814328 1967.5155482858054 1971.7285063762304 1976.2554911816376 1981.1876664447204 1986.6399169804304 1992.7548675989271 1999.707301003268 2007.7089925721175 2017.013979937759 2027.924285269687".split(" ");
        String[] yString = "-0.09568587348118619 -0.19093275083569977 -0.3388224120145939 -0.40339408606358423 -0.4504087187970608 -0.5309200079893815 -0.5991423640266972 -0.7707566904424993 -0.8622544121975458 -0.9520507676692167 -0.9744733141960229 -1.0156624420379057 -1.066764425061773 -1.092757691461189 -1.191087935865976 -1.2321364845786684 -1.3547172082557188 -1.4597452428123976 -1.668666746331748 -1.8879712416798764 -2.15270186460067 -2.5006655395452926 -2.7392155479179094 -3.2144770849228106 -3.7406439573954122 -4.344153375692264 -4.934744659547496 -5.562951605647337 -6.18236535310898 -6.846238476658113 -7.559489752460178 -8.136426268299031 -8.788474385823127 -9.346492583504508 -9.94282897716042 -10.525871920944946 -11.149140264217898 -11.76978039371171 -12.508707602989647 -13.264489496165194 -14.030531053601123 -14.895963104487157 -15.797355302446443 -16.726313145692053 -17.704404305582642 -18.8083358401934 -19.983068660369376 -21.200265423691544 -22.436874432213795 -23.759610905577848 -25.09117832100814 -26.44615414245529 -27.7509669625083 -28.919871288864798 -30.010285837659794 -31.083262286554024 -32.072416169755144 -33.09005818780209 -33.972701552001915 -34.826316717506195 -35.659403027971784 -36.605282661806086 -37.505009540852626 -38.39264555299356 -39.25133721224701 -40.04028363402537 -40.92117934469509 -41.81620349408184 -42.81096586050838 -43.68611349650936 -44.628625325873315 -45.52385526190156 -46.352705434683024 -47.311288965764945 -48.16425624579892 -49.04752816450773 -49.81826107830234 -50.660045432518004 -51.455888026730975 -52.2520189973605 -53.06292181418182 -53.77078661376081 -54.509385602767914 -55.25536615559371 -55.99727611192197 -56.68692488986792 -57.34002605474961 -57.94412252851551 -58.65321941125681 -59.34069804853121 -60.08212291304519 -60.84478238416861 -61.58640799778287 -62.321265238818036 -63.04988170343365 -63.845940894932916 -64.52614321742146 -65.16794085169462 -65.7832737993192 -66.38075069642308 -66.97332615679544 -67.61074033978477 -68.19486473635921 -68.82474293790229 -69.42116783482109 -69.99968224161492 -70.5859616725199 -71.2088274831791 -71.75021985744186 -72.33085408326437 -72.9249529217441 -73.6268278390527 -74.28055303555473 -74.93323522194316 -75.67675294653642 -76.40430881083549 -77.21214782590499 -77.97480824385507 -78.798001880053 -79.60768816051049 -80.52677345433837 -81.34778111933089 -82.26717708977905 -83.12116739348328 -83.93843618129324 -84.78401895196366 -85.61169675348629 -86.54360848184515 -87.32301711097274 -88.19164784456929 -89.02274711731671 -89.78339352183858 -90.5599254166641 -91.34556119061072 -92.13660683070837 -92.97228333554695 -93.82161001671768 -94.59806700636746 -95.40844864450531 -96.17466405266195 -96.95383370666983 -97.72914918716378 -98.43188229693928 -99.16704191754064 -99.92192851022523 -100.7860235271489 -101.56555607166153 -102.40183388109915 -103.18065183533076 -104.05083917278824 -104.912141398584 -105.78833241307261 -106.73507281733124 -107.74180589854164 -108.7782450100002 -109.78530106492596 -110.81390930916825 -111.86670748665277 -112.95509692568513 -114.06792308785856 -115.20497037637455 -116.36613205726695 -117.5515115398149 -118.76155739376748 -119.99723469412521 -121.2602373008911 -122.55324568120307 -123.88023488125998 -125.24683725545333 -126.6607645601168 -128.13229401930522 -129.67482297001678 -131.30549669426733 -133.0459140454335 -134.92291547627133 -136.96945807602822 -139.22558222405462 -141.7394744673334 -144.56863122933296 -147.78112795760205 -151.4569983175133 -155.68972803957135 -160.58786802769527".split(" ");
        int i = 0;
        Double[] xArray = new Double[xString.length];
        for (String str : xString)
            xArray[i++] = Double.parseDouble(str);
        i = 0;
        Double[] yArray = new Double[yString.length];
        for (String str : yString)
            yArray[i++] = Double.parseDouble(str);

        int[][][] image = getPixelsArray(bufferedImage);
        int width = image[0].length;
        int height = image.length;

//        int scale = 4;
//        int[][][] newImage = new int[height * scale][width * scale][3];
//        for (int h = 0; h < height * scale; h++) {
//            for (int w = 0; w < width * scale; w++) {
//                newImage[h][w] = getSubPixel(image, (h - (scale - 1) / 2.0) / scale, (w - (scale - 1) / 2.0) / scale);
//            }
//        }

        double r;
        double d;
        double dy = 0;
        double dx = 0;
        int[][][] newImage = new int[height][width][3];
        for (int h = -height / 2; h < height / 2; h++) {
            for (int w = -width / 2; w < width / 2; w++) {
                newImage[h + height / 2][w + width / 2] = getSubPixel(image, h + height / 2 + 0.5, w + width / 2 + 0.5);
                r = Math.pow(Math.pow(h, 2) + Math.pow(w, 2), 0.5);
                dy = 0;
                dx = 0;
                if (r > 1330) {
                    d = getd(r, xArray, yArray);

                    if (h == 0) {
                        dy = 0;
                        continue;
                    } else {
                        dy = Math.pow(Math.pow(d, 2) / (1 + Math.pow(w, 2) / Math.pow(h, 2)), 0.5);
                    }

                    if (w == 0) {
                        dx = 0;
                        continue;
                    } else {
                        dx = Math.pow(Math.pow(d, 2) / (1 + Math.pow(h, 2) / Math.pow(w, 2)), 0.5);
                    }
//                    System.out.println(d + " " + h + " " + dy + " " + w + " " + dx + " ");
                }
                newImage[h + height / 2][w + width / 2] = getSubPixel(image, h * (1.0 - Math.abs(dy) / Math.abs(h)) + height / 2, w * (1.0 - Math.abs(dx) / Math.abs(w)) + width / 2);
            }
        }

        File outputFile = new File("C:\\Users\\User\\IdeaProjects\\CorrectionCustomLensDistortion\\src\\img.jpg");
        ImageIO.write(getBufferedImage(newImage), "png", outputFile);
    }

    private static double getd(double r, Double[] xArray, Double[] yArray) {
        double x0, x1, y0, y1;

        if (xArray[xArray.length - 1] < r) {
            x0 = xArray[xArray.length - 2];
            x1 = xArray[xArray.length - 1];
            y0 = yArray[yArray.length - 2];
            y1 = yArray[yArray.length - 1];

            return y0 + ((y1 - y0) * (r - x0)) / (x1 - x0);

        } else {
            for (int i = 0; i < xArray.length; i++) {
                if (xArray[i] <= r && xArray[i + 1] >= r) {
                    x0 = xArray[i];
                    x1 = xArray[i + 1];
                    y0 = yArray[i];
                    y1 = yArray[i + 1];

                    return y0 + ((y1 - y0) * (r - x0)) / (x1 - x0);
                }
            }
        }

        return 0;
    }

    private static double restrictRange(double num, double left, double right) {
        if (left <= num && num <= right) {
            return num;
        }
        if (num > right) {
            return right;
        } else {
            return left;
        }
    }

    private static int[] cubicInterpolation(int[] p0, int[] p1, int[] p2, int[] p3, double x) {
        int[] rgb = new int[3];

        rgb[0] = (int) restrictRange(
                Math.pow(x, 3) * (-0.5 * p0[0] + 1.5 * p1[0] - 1.5 * p2[0] + 0.5 * p3[0]) + Math.pow(x, 2) * (p0[0] - 2.5 * p1[0] + 2 * p2[0] - 0.5 * p3[0]) + x * (-0.5 * p0[0] + 0.5 * p2[0]) + p1[0],
                0,
                255
        );

        rgb[1] = (int) restrictRange(
                Math.pow(x, 3) * (-0.5 * p0[1] + 1.5 * p1[1] - 1.5 * p2[1] + 0.5 * p3[1]) + Math.pow(x, 2) * (p0[1] - 2.5 * p1[1] + 2 * p2[1] - 0.5 * p3[1]) + x * (-0.5 * p0[1] + 0.5 * p2[1]) + p1[1],
                0,
                255
        );

        rgb[2] = (int) restrictRange(
                Math.pow(x, 3) * (-0.5 * p0[2] + 1.5 * p1[2] - 1.5 * p2[2] + 0.5 * p3[2]) + Math.pow(x, 2) * (p0[2] - 2.5 * p1[2] + 2 * p2[2] - 0.5 * p3[2]) + x * (-0.5 * p0[2] + 0.5 * p2[2]) + p1[2],
                0,
                255
        );

        return rgb;
    }

    private static int[] getSubPixel(int[][][] image, double y, double x) {
        y = restrictRange(y, 0, image.length - 1);
        x = restrictRange(x, 0, image[0].length - 1);

        if (y % 1 == 0 && x % 1 == 0) {
            return image[(int) y][(int) x];
        }

        if (y % 1 == 0) {
            int x0 = Math.max((int) x - 1, 0);
            int x1 = (int) x;
            int x2 = x1 + 1;
            int x3 = Math.min(x2 + 1, image[0].length - 1);

            return cubicInterpolation(image[(int) y][x0], image[(int) y][x1], image[(int) y][x2], image[(int) y][x3], x % 1);
        }

        if (x % 1 == 0) {
            int y0 = Math.max((int) y - 1, 0);
            int y1 = (int) y;
            int y2 = y1 + 1;
            int y3 = Math.min(y2 + 1, image.length - 1);

            return cubicInterpolation(image[y0][(int) x], image[y1][(int) x], image[y2][(int) x], image[y3][(int) x], y % 1);
        }

        int y0 = Math.max((int) y - 1, 0);
        int y1 = (int) y;
        int y2 = y1 + 1;
        int y3 = Math.min(y2 + 1, image.length - 1);

        int x0 = Math.max((int) x - 1, 0);
        int x1 = (int) x;
        int x2 = x1 + 1;
        int x3 = Math.min(x2 + 1, image[0].length - 1);

        return cubicInterpolation(
                cubicInterpolation(image[y0][x0], image[y0][x1], image[y0][x2], image[y0][x3], x % 1),
                cubicInterpolation(image[y1][x0], image[y1][x1], image[y1][x2], image[y1][x3], x % 1),
                cubicInterpolation(image[y2][x0], image[y2][x1], image[y2][x2], image[y2][x3], x % 1),
                cubicInterpolation(image[y3][x0], image[y3][x1], image[y3][x2], image[y3][x3], x % 1),
                y % 1
        );
    }

    private static BufferedImage getBufferedImage(int[][][] image) {
        int width = image[0].length;
        int height = image.length;

        BufferedImage newBufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int[] raw = new int[width * height];

        int i = 0;
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                raw[i] = 0xFF000000 | ((image[h][w][0] & 0xFF) << 16) | ((image[h][w][1] & 0xFF) << 8) | ((image[h][w][2] & 0xFF));
                i++;
            }

        }
        newBufferedImage.setRGB(0, 0, width, height, raw, 0, width);
        return newBufferedImage;
    }

    private static int[][][] getPixelsArray(BufferedImage image) {
        final byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
        final int width = image.getWidth();
        final int height = image.getHeight();

        int[][][] resultImg = new int[height][width][3];
        final int pixelLength = 3;
        int row = 0;
        int col = 0;
        for (int pixel = 0; pixel + 2 < pixels.length; pixel += pixelLength) {
            resultImg[row][col][0] = (int) pixels[pixel + 2] & 0xff;       // red
            resultImg[row][col][1] = (int) pixels[pixel + 1] & 0xff;       // green
            resultImg[row][col][2] = (int) pixels[pixel] & 0xff;           // blue

            col++;
            if (col == width) {
                col = 0;
                row++;
            }
        }

        return resultImg;
    }
}