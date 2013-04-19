/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Gustavo
 */
public class MotorCalculaEquacoes {

    private LinkedList numerosPerfeitos = new LinkedList();
    private int limite = 20000;

    public MotorCalculaEquacoes() {
    }

    public void calcula() {
        //      numerosPerfeitos = calcula2KK();
        //   calculaSolucao5();
//        ArrayList lista = calculaSolucao7();
//        for (Object o : lista) {
//            int[] aux = (int[]) o;
//            System.out.println(aux[0] + " " + aux[1] + " " + aux[2]);
//
//        }
        sol12();
    }

    public void calculaSolucao3() {
        // para x = 2k  zero segundo
        // pára x = 20k = 4s
        // pára x = 200k =
        //434657
        int x = 434655;
        int y = 2;
        int z = 1;
        ArrayList lista = new ArrayList();


        while (x < limite) {


//            System.out.println("X: " + x);


            if (z != y && y != x) {

                if (isPerfectSquare(x - y)) {
                    System.out.println("1/6 X: " + x + " Y:" + y + " Z:" + z);
                    if (isPerfectSquare(x - z)) {
                        System.out.println("2/6 X: " + x + " Y:" + y + " Z:" + z);
                        if (isPerfectSquare(y - z)) {
                            System.out.println("3/6 X: " + x + " Y:" + y + " Z:" + z);

                            if (isPerfectSquare(x + y)) {
                                System.out.println("4/6 X: " + x + " Y:" + y + " Z:" + z);
                                if (isPerfectSquare(y + z)) {
                                    System.out.println("5/6 X: " + x + " Y:" + y + " Z:" + z);
                                    if (isPerfectSquare(x + z)) {
//                                        System.out.println("3/4 X: " + x + " Y:" + y + " Z:" + z);
                                        // if (x != y && y != z && x != z) {
//                                            System.out.println("4/4 X: " + x + " Y:" + y + " Z:" + z);                           
                                        System.out.println("6/6 X: " + x + " Y:" + y + " Z:" + z);
                                        lista.add(new int[]{x, y, z});
                                        // numerosPerfeitos.add(pacote);
                                        x++;
                                        //   }
                                    }
                                }


                            }
                        }
                    }
                }
            }
            if (z + 1 >= y) {
                z = 2;
                y++;

            } else {
                z++;
            }
            if (y + 1 >= x) {
                y = 2;
                x++;

            } else {
                y++;

            }



        }
        System.out.println(lista);
    }

    public void calcula2KK269() {
        //NUMEROS TESTADOS : 2k -  CONSTRUÍDO COM SUCESSO (tempo total: 0 segundos
        //NUMEROS TESTADOS : 20k - CONSTRUÍDO COM SUCESSO (tempo total: 2 segundos)
        //NUMEROS TESTADOS : 200k - CONSTRUÍDO COM SUCESSO (tempo total: 3 minutos 24 segundos)
        //NUMEROS TESTADOS X = 2KK
        //TEMPO TOTAL DE EXECUÇÃO: CONSTRUÍDO COM SUCESSO (tempo total: 269 minutos 14 segundos)

        // SEQUENCIAS ENCONTRADAS X : Y: Z: 
        // X:434657 Y: 420968 Z: 150568
        // X:733025 Y: 488000 Z: 418304
        // X:993250 Y: 949986 Z: 856350
        // X:1738628 Y: 1683872 Z: 602272




        for (int x = 3; x <= limite; x++) {
            for (int y = 2; y < x; y++) {
                if (isPerfectSquare(x - y)) {
                    if (isPerfectSquare(x + y)) {
                        System.out.println("X: " + x + " Y: " + y);
                        for (int z = 1; z < y; z++) {
                            if (isPerfectSquare(x - z)) {
                                if (isPerfectSquare(x + z)) {
                                    if (isPerfectSquare(y - z)) {
                                        if (isPerfectSquare(y + z)) {
                                            Pacote pacote = new Pacote(x, y, z);
                                            adicionaNaLista(pacote);
                                            System.out.println(" x: " + x + " y: " + y + " z: " + z);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void calcula2KK773() {


//X: 434657 Y: 420968 Z: 150568
//X: 733025 Y: 488000 Z: 418304
//X: 993250 Y: 949986 Z: 856350
//X: 1738628 Y: 1683872 Z: 602272
//CONSTRUÍDO COM SUCESSO (tempo total: 773 minutos 39 segundos)


        //NUMEROS TESTADOS X = 2KK
        LinkedList lista = new LinkedList();

        for (int x = 3; x <= limite; x++) {
            System.out.println("X: " + x);
            for (int y = 2; y < x; y++) {
                if (isPerfectSquare(x - y)) {
                    if (isPerfectSquare(x + y)) {
                        //System.out.println("X: " + x + " Y: " + y);
                        for (int z = 1; z < y; z++) {
                            if (isPerfectSquare(x - z)) {
                                if (isPerfectSquare(y - z)) {
                                    if (isPerfectSquare(x + z)) {
                                        //           System.out.println("3/4 X: " + x + " Y:" + y + " Z:" + z);
                                        if (isPerfectSquare(y + z)) {
                                            Pacote pacote = new Pacote(x, y, z);
                                            //      lista.add(pacote);
                                            numerosPerfeitos.add(pacote);

                                            System.out.println("x: " + x + " y: " + y + " z: " + z);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public void calcula2KKTestadoError() {

        for (int x = 3; x <= limite; x++) {
            for (int y = 2; y < x; y++) {
                if (isPerfectSquare(x - y)) {
                    if (isPerfectSquare(x + y)) {
                        for (int z = 1; z < limite; z++) {
                            if (isPerfectSquare(x - z)) {
                                if (isPerfectSquare(x + z)) {
                                    if (isPerfectSquare(y - z)) {
                                        if (isPerfectSquare(y + z)) {
                                            Pacote pacote = new Pacote(x, y, z);
                                            adicionaNaLista(pacote);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public LinkedList getNumerosPerfeitos() {
        return numerosPerfeitos;
    }

    public int getNumerosPerfeitosTamanho() {
        return numerosPerfeitos.size();
    }

    private void adicionaNaLista(Pacote pacote) {
        //   if (!op.jaTemNaLista(numerosPerfeitos, pacote.getResultado()))
        numerosPerfeitos.add(pacote);


    }

    public void calculaSolucao4() {
        //CONSTRUÍDO COM SUCESSO (tempo total: 204 minutos 9 segundos)
        LinkedList comparaListasXY = comparaListasXY(limite);
        LinkedList comparaListasXYZ = comparaListasXYZ(comparaListasXY);
        System.out.println("tamanho da lista: " + comparaListasXYZ.size());
        System.out.println("\n");
        //      System.out.println(comparaListasXYZ);

        numerosPerfeitos.addAll(comparaListasXYZ);

    }

    private LinkedList comparaListasXY(int valorFim) {
        LinkedList listaRetorno = new LinkedList();
//        System.out.println("INICIO - 1/3");
        for (int x = 3; x <= valorFim; x++) {
            for (int y = 2; y < x; y++) {
                if (isPerfectSquare(x - y)) {
                    if (isPerfectSquare(x + y)) {
                        //             System.out.println("X: "+x);
                        listaRetorno.add(new Pacote(x, y, -1));
                    }
                }
            }
        }
//        System.out.println("FIM - 1/3");
        return listaRetorno;
    }

    private LinkedList comparaListasXYZ(LinkedList listaA) {
        LinkedList listaRetorno = new LinkedList();
        //   System.out.println("INICIO - 2/3");
        while (listaA.size() > 0) {
            Pacote a = (Pacote) listaA.remove(0);
            long x = a.getValorA();
            long y = a.getValorB();
            //          System.out.println("X: "+x);
            for (int z = 1; z < y; z++) {
                if (isPerfectSquare(x - z)) {
                    if (isPerfectSquare(y - z)) {
                        if (isPerfectSquare(x + z)) {
                            if (isPerfectSquare(y + z)) {
                                listaRetorno.add(new Pacote(x, y, z));
                            }
                        }
                    }
                }
            }
        }
//        System.out.println("FIM - 2/3");
        return listaRetorno;
    }

    private boolean isPerfectSquare3(long resultado) {
//	 Mathematical trick - Check if the floor of the square root squared is the same as the original number
        long sqrt = (long) StrictMath.sqrt(resultado);
        return (sqrt * sqrt == (double) resultado);

    }

    private boolean isPerfectSquare(long n) {

        //http://stackoverflow.com/questions/295579/fastest-way-to-determine-if-an-integers-square-root-is-an-integer
        //http://stackoverflow.com/users/3508/a-rex

        // Quickfail
        if (n < 0 || ((n & 2) != 0) || ((n & 7) == 5) || ((n & 11) == 8)) {
            return false;
        }
        if (n == 0) {
            return true;
        }

        // Check mod 255 = 3 * 5 * 17, for fun
        long y = n;
        y = (y & 0xffffffffL) + (y >> 32);
        y = (y & 0xffffL) + (y >> 16);
        y = (y & 0xffL) + ((y >> 8) & 0xffL) + (y >> 16);
        if (bad255[(int) y]) {
            return false;
        }

        // Divide out powers of 4 using binary search
        if ((n & 0xffffffffL) == 0) {
            n >>= 32;
        }
        if ((n & 0xffffL) == 0) {
            n >>= 16;
        }
        if ((n & 0xffL) == 0) {
            n >>= 8;
        }
        if ((n & 0xfL) == 0) {
            n >>= 4;
        }
        if ((n & 0x3L) == 0) {
            n >>= 2;
        }

        if ((n & 0x7L) != 1) {
            return false;
        }

        // Compute sqrt using something like Hensel's lemma
        long r, t, z;
        r = start[(int) ((n >> 3) & 0x3ffL)];
        do {
            z = n - r * r;
            if (z == 0) {
                return true;
            }
            if (z < 0) {
                return false;
            }
            t = z & (-z);
            r += (z & t) >> 1;
            if (r > (t >> 1)) {
                r = t - r;
            }
        } while (t <= (1L << 33));
        return false;
    }
    private static boolean[] bad255 = {
        false, false, true, true, false, true, true, true, true, false, true, true, true,
        true, true, false, false, true, true, false, true, false, true, true, true, false,
        true, true, true, true, false, true, true, true, false, true, false, true, true,
        true, true, true, true, true, true, true, true, true, true, false, true, false,
        true, true, true, false, true, true, true, true, false, true, true, true, false,
        true, false, true, true, false, false, true, true, true, true, true, false, true,
        true, true, true, false, true, true, false, false, true, true, true, true, true,
        true, true, true, false, true, true, true, true, true, false, true, true, true,
        true, true, false, true, true, true, true, false, true, true, true, false, true,
        true, true, true, false, false, true, true, true, true, true, true, true, true,
        true, true, true, true, true, false, false, true, true, true, true, true, true,
        true, false, false, true, true, true, true, true, false, true, true, false, true,
        true, true, true, true, true, true, true, true, true, true, false, true, true,
        false, true, false, true, true, false, true, true, true, true, true, true, true,
        true, true, true, true, false, true, true, false, true, true, true, true, true,
        false, false, true, true, true, true, true, true, true, false, false, true, true,
        true, true, true, true, true, true, true, true, true, true, true, false, false,
        true, true, true, true, false, true, true, true, false, true, true, true, true,
        false, true, true, true, true, true, false, true, true, true, true, true, false,
        true, true, true, true, true, true, true, true, false, false, true, true, false,
        true, true, true, true, false, true, true, true, true, true, false, false, true,
        true, false, true, false, true, true, true, false, true, true, true, true, false,
        true, true, true, false, true, false, true, true, true, true, true, true, true,
        true, true, true, true, true, false, true, false, true, true, true, false, true,
        true, true, true, false, true, true, true, false, true, false, true, true, false,
        false, true, true, true, true, true, false, true, true, true, true, false, true,
        true, false, false, true, true, true, true, true, true, true, true, false, true,
        true, true, true, true, false, true, true, true, true, true, false, true, true,
        true, true, false, true, true, true, false, true, true, true, true, false, false,
        true, true, true, true, true, true, true, true, true, true, true, true, true,
        false, false, true, true, true, true, true, true, true, false, false, true, true,
        true, true, true, false, true, true, false, true, true, true, true, true, true,
        true, true, true, true, true, false, true, true, false, true, false, true, true,
        false, true, true, true, true, true, true, true, true, true, true, true, false,
        true, true, false, true, true, true, true, true, false, false, true, true, true,
        true, true, true, true, false, false, true, true, true, true, true, true, true,
        true, true, true, true, true, true, false, false, true, true, true, true, false,
        true, true, true, false, true, true, true, true, false, true, true, true, true,
        true, false, true, true, true, true, true, false, true, true, true, true, true,
        true, true, true, false, false
    };
    private static int[] start = {
        1, 3, 1769, 5, 1937, 1741, 7, 1451, 479, 157, 9, 91, 945, 659, 1817, 11,
        1983, 707, 1321, 1211, 1071, 13, 1479, 405, 415, 1501, 1609, 741, 15, 339, 1703, 203,
        129, 1411, 873, 1669, 17, 1715, 1145, 1835, 351, 1251, 887, 1573, 975, 19, 1127, 395,
        1855, 1981, 425, 453, 1105, 653, 327, 21, 287, 93, 713, 1691, 1935, 301, 551, 587,
        257, 1277, 23, 763, 1903, 1075, 1799, 1877, 223, 1437, 1783, 859, 1201, 621, 25, 779,
        1727, 573, 471, 1979, 815, 1293, 825, 363, 159, 1315, 183, 27, 241, 941, 601, 971,
        385, 131, 919, 901, 273, 435, 647, 1493, 95, 29, 1417, 805, 719, 1261, 1177, 1163,
        1599, 835, 1367, 315, 1361, 1933, 1977, 747, 31, 1373, 1079, 1637, 1679, 1581, 1753, 1355,
        513, 1539, 1815, 1531, 1647, 205, 505, 1109, 33, 1379, 521, 1627, 1457, 1901, 1767, 1547,
        1471, 1853, 1833, 1349, 559, 1523, 967, 1131, 97, 35, 1975, 795, 497, 1875, 1191, 1739,
        641, 1149, 1385, 133, 529, 845, 1657, 725, 161, 1309, 375, 37, 463, 1555, 615, 1931,
        1343, 445, 937, 1083, 1617, 883, 185, 1515, 225, 1443, 1225, 869, 1423, 1235, 39, 1973,
        769, 259, 489, 1797, 1391, 1485, 1287, 341, 289, 99, 1271, 1701, 1713, 915, 537, 1781,
        1215, 963, 41, 581, 303, 243, 1337, 1899, 353, 1245, 329, 1563, 753, 595, 1113, 1589,
        897, 1667, 407, 635, 785, 1971, 135, 43, 417, 1507, 1929, 731, 207, 275, 1689, 1397,
        1087, 1725, 855, 1851, 1873, 397, 1607, 1813, 481, 163, 567, 101, 1167, 45, 1831, 1205,
        1025, 1021, 1303, 1029, 1135, 1331, 1017, 427, 545, 1181, 1033, 933, 1969, 365, 1255, 1013,
        959, 317, 1751, 187, 47, 1037, 455, 1429, 609, 1571, 1463, 1765, 1009, 685, 679, 821,
        1153, 387, 1897, 1403, 1041, 691, 1927, 811, 673, 227, 137, 1499, 49, 1005, 103, 629,
        831, 1091, 1449, 1477, 1967, 1677, 697, 1045, 737, 1117, 1737, 667, 911, 1325, 473, 437,
        1281, 1795, 1001, 261, 879, 51, 775, 1195, 801, 1635, 759, 165, 1871, 1645, 1049, 245,
        703, 1597, 553, 955, 209, 1779, 1849, 661, 865, 291, 841, 997, 1265, 1965, 1625, 53,
        1409, 893, 105, 1925, 1297, 589, 377, 1579, 929, 1053, 1655, 1829, 305, 1811, 1895, 139,
        575, 189, 343, 709, 1711, 1139, 1095, 277, 993, 1699, 55, 1435, 655, 1491, 1319, 331,
        1537, 515, 791, 507, 623, 1229, 1529, 1963, 1057, 355, 1545, 603, 1615, 1171, 743, 523,
        447, 1219, 1239, 1723, 465, 499, 57, 107, 1121, 989, 951, 229, 1521, 851, 167, 715,
        1665, 1923, 1687, 1157, 1553, 1869, 1415, 1749, 1185, 1763, 649, 1061, 561, 531, 409, 907,
        319, 1469, 1961, 59, 1455, 141, 1209, 491, 1249, 419, 1847, 1893, 399, 211, 985, 1099,
        1793, 765, 1513, 1275, 367, 1587, 263, 1365, 1313, 925, 247, 1371, 1359, 109, 1561, 1291,
        191, 61, 1065, 1605, 721, 781, 1735, 875, 1377, 1827, 1353, 539, 1777, 429, 1959, 1483,
        1921, 643, 617, 389, 1809, 947, 889, 981, 1441, 483, 1143, 293, 817, 749, 1383, 1675,
        63, 1347, 169, 827, 1199, 1421, 583, 1259, 1505, 861, 457, 1125, 143, 1069, 807, 1867,
        2047, 2045, 279, 2043, 111, 307, 2041, 597, 1569, 1891, 2039, 1957, 1103, 1389, 231, 2037,
        65, 1341, 727, 837, 977, 2035, 569, 1643, 1633, 547, 439, 1307, 2033, 1709, 345, 1845,
        1919, 637, 1175, 379, 2031, 333, 903, 213, 1697, 797, 1161, 475, 1073, 2029, 921, 1653,
        193, 67, 1623, 1595, 943, 1395, 1721, 2027, 1761, 1955, 1335, 357, 113, 1747, 1497, 1461,
        1791, 771, 2025, 1285, 145, 973, 249, 171, 1825, 611, 265, 1189, 847, 1427, 2023, 1269,
        321, 1475, 1577, 69, 1233, 755, 1223, 1685, 1889, 733, 1865, 2021, 1807, 1107, 1447, 1077,
        1663, 1917, 1129, 1147, 1775, 1613, 1401, 555, 1953, 2019, 631, 1243, 1329, 787, 871, 885,
        449, 1213, 681, 1733, 687, 115, 71, 1301, 2017, 675, 969, 411, 369, 467, 295, 693,
        1535, 509, 233, 517, 401, 1843, 1543, 939, 2015, 669, 1527, 421, 591, 147, 281, 501,
        577, 195, 215, 699, 1489, 525, 1081, 917, 1951, 2013, 73, 1253, 1551, 173, 857, 309,
        1407, 899, 663, 1915, 1519, 1203, 391, 1323, 1887, 739, 1673, 2011, 1585, 493, 1433, 117,
        705, 1603, 1111, 965, 431, 1165, 1863, 533, 1823, 605, 823, 1179, 625, 813, 2009, 75,
        1279, 1789, 1559, 251, 657, 563, 761, 1707, 1759, 1949, 777, 347, 335, 1133, 1511, 267,
        833, 1085, 2007, 1467, 1745, 1805, 711, 149, 1695, 803, 1719, 485, 1295, 1453, 935, 459,
        1151, 381, 1641, 1413, 1263, 77, 1913, 2005, 1631, 541, 119, 1317, 1841, 1773, 359, 651,
        961, 323, 1193, 197, 175, 1651, 441, 235, 1567, 1885, 1481, 1947, 881, 2003, 217, 843,
        1023, 1027, 745, 1019, 913, 717, 1031, 1621, 1503, 867, 1015, 1115, 79, 1683, 793, 1035,
        1089, 1731, 297, 1861, 2001, 1011, 1593, 619, 1439, 477, 585, 283, 1039, 1363, 1369, 1227,
        895, 1661, 151, 645, 1007, 1357, 121, 1237, 1375, 1821, 1911, 549, 1999, 1043, 1945, 1419,
        1217, 957, 599, 571, 81, 371, 1351, 1003, 1311, 931, 311, 1381, 1137, 723, 1575, 1611,
        767, 253, 1047, 1787, 1169, 1997, 1273, 853, 1247, 413, 1289, 1883, 177, 403, 999, 1803,
        1345, 451, 1495, 1093, 1839, 269, 199, 1387, 1183, 1757, 1207, 1051, 783, 83, 423, 1995,
        639, 1155, 1943, 123, 751, 1459, 1671, 469, 1119, 995, 393, 219, 1743, 237, 153, 1909,
        1473, 1859, 1705, 1339, 337, 909, 953, 1771, 1055, 349, 1993, 613, 1393, 557, 729, 1717,
        511, 1533, 1257, 1541, 1425, 819, 519, 85, 991, 1693, 503, 1445, 433, 877, 1305, 1525,
        1601, 829, 809, 325, 1583, 1549, 1991, 1941, 927, 1059, 1097, 1819, 527, 1197, 1881, 1333,
        383, 125, 361, 891, 495, 179, 633, 299, 863, 285, 1399, 987, 1487, 1517, 1639, 1141,
        1729, 579, 87, 1989, 593, 1907, 839, 1557, 799, 1629, 201, 155, 1649, 1837, 1063, 949,
        255, 1283, 535, 773, 1681, 461, 1785, 683, 735, 1123, 1801, 677, 689, 1939, 487, 757,
        1857, 1987, 983, 443, 1327, 1267, 313, 1173, 671, 221, 695, 1509, 271, 1619, 89, 565,
        127, 1405, 1431, 1659, 239, 1101, 1159, 1067, 607, 1565, 905, 1755, 1231, 1299, 665, 373,
        1985, 701, 1879, 1221, 849, 627, 1465, 789, 543, 1187, 1591, 923, 1905, 979, 1241, 181
    };

    public ArrayList calculaSolucao5() {
        //CONSTRUÍDO COM SUCESSO (tempo total: 204 minutos 9 segundos)
        int valorFim = 500000;
//        System.out.println("tamanho da lista: "+comparaListasXYZ.size());
//        System.out.println("\n");
        //      System.out.println(comparaListasXYZ);
        ArrayList listaA = new ArrayList<>();
        ArrayList listaRetorno = new ArrayList<>();
        System.out.println("INICIO - 0/3");

        for (int x = 3; x <= valorFim; x++) {
//        System.out.println("0/3 X: "+x);

            int y = x - 1;

            if (y == 420968) {
                System.out.println("achei y");
            }
            if (isPerfectSquare(x - y)) {
                if (isPerfectSquare(x + y)) {

                    listaA.add(new int[]{x, y});
                }
            }

        }
        System.out.println("Lista preliminar de tamanho: " + listaA.size());
        System.out.println("INICIO - 1/3");
        for (int i = 1; i < valorFim; i++) {
            int a[] = (int[]) listaA.get(0);
            int x = a[0];
            int y = a[1];
//            System.out.println("1/3 I: "+i);
            for (int z = 1; z < y; z++) {
                // X:434657 Y: 420968 Z: 150568
                System.out.println("2/3 X: " + x + " Y: " + y + " Z:" + z);
                if (isPerfectSquare(x - z)) {
                    if (isPerfectSquare(y - z)) {
                        if (isPerfectSquare(x + z)) {
//                            System.out.println("2/3 X: "+x+" Y: "+y+" Z:"+z);
                            if (isPerfectSquare(y + z)) {
                                listaRetorno.add(new int[]{x, y, z});
                            }
                        }
                    }
                }
            }
        }
        System.out.println(listaRetorno.size());
//        System.out.println("FIM - 1/3");
        return listaRetorno;
    }

    public ArrayList calculaSolucao7() {
        // para x = 2k  zero segundo
        // pára x = 20k = 4s
        // pára x = 200k =
        //434657
        int x = 3;
        int y = 2;
        int z = 1;
        ArrayList lista = new ArrayList<>();

        while (x < limite) {

//            System.out.println("X: " + x);
            if (z != y && y != x) {
                if (isPerfectSquare(x - y)) {
//                    System.out.println("1/6 X: " + x + " Y:" + y + " Z:" + z);
                    if (isPerfectSquare(x + y)) {
                        while (z < y) {
                            if (isPerfectSquare(x - z)) {
//                            System.out.println("2/6 X: " + x + " Y:" + y + " Z:" + z);
                                if (isPerfectSquare(y - z)) {
//                                System.out.println("3/6 X: " + x + " Y:" + y + " Z:" + z);


                                    if (isPerfectSquare(y + z)) {
//                                       System.out.println("X: " + x);
                                        //System.out.println("5/6 X: " + x + " Y:" + y + " Z:" + z);
                                        if (isPerfectSquare(x + z)) {
//                                        System.out.println("3/4 X: " + x + " Y:" + y + " Z:" + z);
                                            // if (x != y && y != z && x != z) {
//                                            System.out.println("4/4 X: " + x + " Y:" + y + " Z:" + z);                           
                                            System.out.println(">>>>>>>>>>>>>>>>>>   6/6 X: " + x + " Y:" + y + " Z:" + z);
                                            lista.add(new int[]{x, y, z});
                                            // numerosPerfeitos.add(pacote);
                                            x++;
                                            //   }
                                        }
                                    }
                                }


                            }
                            z++;
                        }
                        z = 1;
                    }

                }
                if (y + 1 >= x) {
                    y = 2;
                    x++;
                } else {
                    y++;

                }
            }
        }

        System.out.println(lista.size());
        return lista;

    }

    public ArrayList calculaSolucao8() {
        // para x = 2k  zero segundo
        // pára x = 20k = 4s
        // pára x = 200k =
        //434657
        int x = 3;
        int y = 2;
        int z = 1;
        ArrayList lista = new ArrayList<>();

        while (x < limite) {

            lista.add(new int[]{x, y, z});
        }

        System.out.println(lista.size());
        return lista;

    }

    public void recursao() {

        for (int x = 3; x <= limite; x++) {
            for (int y = 2; y < x; y++) {
                if (x != y) {
                    if (isPerfectSquare(x + y)) {
                        if (isPerfectSquare(x - y)) {
                            possuiQuadrado(x, y, 1);
                        }
                    }
                }

            }

        }
    }

    public boolean possuiQuadrado(int x, int y, int z) {
//CONSTRUÍDO COM SUCESSO (tempo total: 228 minutos 47 segundos)
        for (; z < y; z++) {
//        System.out.println("<<<X: " + x + " Y:" + y + " Z:" + z);
            if (x != y && y != z && z != x) {
                if (isPerfectSquare(x - z)) {
                    if (isPerfectSquare(y - z)) {
                        if (isPerfectSquare(x + z)) {
                            if (isPerfectSquare(y + z)) {
                                System.out.println(">>>>>>>>>>>>>>>>>>   6/6 X: " + x + " Y:" + y + " Z:" + z);
                                numerosPerfeitos.add(new int[]{x, y, z});
                                return true;
                            }
                        }

                    }
                }
            }
        }
        return false;


    }

    public void solucao10CalculaComArray() {
        ArrayList lista;
        ArrayList lista2;
        ArrayList listaAux = new ArrayList<>();

        // SEQUENCIAS ENCONTRADAS X : Y: Z: 
        // X:434657 Y: 420968 Z: 150568
        // X:733025 Y: 488000 Z: 418304
        // X:993250 Y: 949986 Z: 856350
        // X:1738628 Y: 1683872 Z: 602272 
        int limiteLocal = 500000;
        System.out.println("Iniciando primeiro laço: ");
        lista = new ArrayList(solucao10geraArray(3, limiteLocal, 1));
        System.out.println("Iniciando segundo laço: ");
        lista2 = new ArrayList(solucao10geraArray(2, limiteLocal-1, 2));

        System.out.println("lista1: " + lista.size());
        System.out.println("lista2: " + lista2.size());
        System.out.println("Comparando listas");
        ArrayList comparaYdosArrays = solucao10comparaYdosArrays(lista, lista2);
        System.out.println("Iniciando terceiro laço: ");
        for (int i = 0; i < comparaYdosArrays.size(); i++) {
            Pacote p = (Pacote) comparaYdosArrays.get(i);
            long x = p.getValorA();
            long y = p.getValorB();
            long z = p.getValorC();
            if (solucao10EPerfeito(x, y, z)) {
                System.out.println(">>>>>>" + x + " " + y + " " + z);
                listaAux.add(p);
            }
        }
        System.out.println("Tamanho da lista: " + listaAux.size());
    }

    public boolean isPerfectSquare2(long valor) {

        return isPerfectSquare(valor*valor);

    }

    public ArrayList solucao10comparaYdosArrays(ArrayList lista1, ArrayList lista2) {
        ArrayList listaFim = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
//            System.out.println(i);
            Pacote p = (Pacote) lista1.remove(i);
            long x1 = p.getValorA();
            long y1 = p.getValorB();
            for (int j = 0; j < lista2.size(); j++) {
                Pacote pAux = (Pacote) lista2.get(j);
                long y2 = pAux.getValorB();
                long z = pAux.getValorC();
                if (y1 == y2) {
                    listaFim.add(new Pacote(x1, y1, z));
                }
            }
        }
        if (!listaFim.isEmpty()) {
            return listaFim;
        }
        return null;
    }

    public ArrayList solucao10geraArray(int inicio, int limiteLocal, int xouy) {
        ArrayList lista = new ArrayList();
        for (int x = inicio; x <= limiteLocal; x++) {
//            System.out.println(x);
            for (int y = 2; y < x; y++) {
                if (isPerfectSquare(x + y)) {
                    if (isPerfectSquare(x - y)) {
                        if (xouy == 1) {
                            lista.add(new Pacote(x, y, -1));
                        } else {
                            lista.add(new Pacote(-1, x, y));
                        }
                    }
                }
            }
        }
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }

    public boolean solucao10EPerfeito(long x, long y, long z) {
        // X:434657 Y: 420968 Z: 150568

       
        if (isPerfectSquare2(x + y)) {
            if (isPerfectSquare2(x - y)) {
                if (isPerfectSquare2(x + z)) {
                    if (isPerfectSquare2(x - z)) {
                        if (isPerfectSquare2(y - z)) {
                            if (isPerfectSquare2(y + z)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    
    public void solucao11() {


        ArrayList numbers = new ArrayList<>();
//        ArrayList possiveis = new ArrayList<>();
        for (long x = 0; x <= 2000; x++) {
            if (isPerfectSquare(x))
            numbers.add(x);
        }
             System.out.println(numbers.size()); 
        for (int i =0;i<numbers.size();i++){
//             System.out.println(numbers.size());      
            long qp1= (long) numbers.get(i);

            for (int nTy =2;nTy<qp1;nTy++){
                
                long qpx = (long)Math.pow(qp1,2) -nTy;
                if (qpx != nTy)
                   
                if (isPerfectSquare(qpx+nTy)&&isPerfectSquare(qpx-nTy)){
                    
                 for (int z = 0; z< nTy;z++){
                 if (isPerfectSquare(qpx+z)&&isPerfectSquare(qpx-z)){
                     if (isPerfectSquare(nTy+z)&&isPerfectSquare(nTy-z)){
                            System.out.println(qpx + " "+nTy+" "+z);      
                     }
                 }
                 
                 }
                   
                }
            }
        
        
        
        }
    }
    public void solucao11comparaYdosArrays(ArrayList lista1) {
       System.out.println("lista1: " + lista1.size());

        for (int i = 0; i<lista1.size(); i++) {
            long[] p = (long[]) lista1.get(i);
            long x1 = p[0];
            long y1 = p[1];


            
            
            
            for (int k = 0; k < lista1.size(); k++) {
                long[] p2 = (long[]) lista1.get(k);
                long y2 = p2[0];
                long z = p2[1];


   
                if (y1 == y2) {

                    if (checkValues(x1, z)) {
                       
                            System.out.println("X: " + x1 + " Y: " + y1 + " Z:" + z);
                        
                        break;

                    }

                }

            }
        }




    }

    public boolean checkValues(long x, long y) {
        
            if (isPerfectSquare(x + y)) {
                if (isPerfectSquare(x - y)) {
                    return true;
                }
            }
        
        return false;
    }
    public ArrayList sol2geraLista() {
        ArrayList numbers = new ArrayList<>();
        for (long x = 1; x <= limite; x++) {
            if (isPerfectSquare(x)) {
                numbers.add(x);
            }
        }
        return numbers;
    }
    public void sol12(){
        // X:434657 Y: 420968 Z: 150568
        // X:733025 Y: 488000 Z: 418304
        // X:993250 Y: 949986 Z: 856350
        // X:1738628 Y: 1683872 Z: 602272 
    
        Hash listaXYpossiveis = new Hash();

        ArrayList sol2geraLista = sol2geraLista();

        System.out.println(sol2geraLista.size());
        System.out.println("laço 1");
        for (Object per : sol2geraLista) {
            long perx1 = (long) per;
            long y = 2;
            for (long x = 3; x < perx1; x++) {
                //for (long y = 2; y < x; y++) {
                if(y>x){
                    y=2;
                }
                    if (perx1 != x && perx1 != y) {
                        if (perx1 == (x + y) || perx1 == (x - y)) {
                            if (checkValues(x, y)) {
                                //listaXYpossiveis.add(new long[]{x, y});
                                listaXYpossiveis.adiciona(new Pacote(x, y));
//                            System.out.println("perx1: " + perx1 + " " + " 1: " + x + " 2: " + y);
                            }
                        }
                    }
                    y++;
             //   }
            }
        }
         

         System.out.println(listaXYpossiveis.size());
    }
}