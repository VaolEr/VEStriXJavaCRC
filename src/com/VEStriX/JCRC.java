package com.VEStriX;



public class JCRC {

        /*public static CRC CRC8 = new CRC("CRC-8", 8, 0x07, 0x00, false, false, 0x00);
        public static CRC CRC8_CDMA2000 = new CRC("CRC-8/CDMA2000", 8, 0x9B, 0xFF, false, false, 0x00);
        public static CRC CRC8_DARC = new CRC("CRC-8/DARC", 8, 0x39, 0x00, true, true, 0x00);
        public static CRC CRC8_DVBS2 = new CRC("CRC-8/DVB-S2", 8, 0xD5, 0x00, false, false, 0x00);
        public static CRC CRC8_EBU = new CRC("CRC-8/EBU", 8, 0x1D, 0xFF, true, true, 0x00);
        public static CRC CRC8_ICODE = new CRC("CRC-8/ICODE", 8, 0x1D, 0xFD, false, false, 0x00);
        public static CRC CRC8_ITU = new CRC("CRC-8/ITU", 8, 0x07, 0x00, false, false, 0x55);
        public static CRC CRC8_MAXIM = new CRC("CRC-8/MAXIM", 8, 0x31, 0x00, true, true, 0x00);
        public static CRC CRC8_ROHC = new CRC("CRC-8/ROHC", 8, 0x07, 0xFF, true, true, 0x00);
        public static CRC CRC8_WCDMA = new CRC("CRC-8/WCDMA", 8, 0x9B, 0x00, true, true, 0x00);

        public static CRC[] CRC8_All = {CRC8, CRC8_CDMA2000, CRC8_DARC, CRC8_DVBS2, CRC8_EBU, CRC8_ICODE, CRC8_ITU, CRC8_MAXIM, CRC8_ROHC, CRC8_WCDMA};

        public static CRC CRC16_CCITT_FALSE = new CRC("CRC-16/CCITT-FALSE", 16, 0x1021, 0xFFFF, false, false, 0x0000);
        public static CRC CRC16_ARC = new CRC("CRC-16/ARC", 16, 0x8005, 0x0000, true, true, 0x0000);
        public static CRC CRC16_AUG_CCITT = new CRC("CRC-16/AUG-CCITT", 16, 0x1021, 0x1D0F, false, false, 0x0000);
        public static CRC CRC16_BUYPASS = new CRC("CRC-16/BUYPASS", 16, 0x8005, 0x0000, false, false, 0x0000);
        public static CRC CRC16_CDMA2000 = new CRC("CRC-16/CDMA2000", 16, 0xC867, 0xFFFF, false, false, 0x0000);
        public static CRC CRC16_DDS_110 = new CRC("CRC-16/DDS-110", 16, 0x8005, 0x800D, false, false, 0x0000);
        public static CRC CRC16_DECT_R = new CRC("CRC-16/DECT-R", 16, 0x0589, 0x0000, false, false, 0x0001);
        public static CRC CRC16_DECT_X = new CRC("CRC-16/DECT-X", 16, 0x0589, 0x0000, false, false, 0x0000);
        public static CRC CRC16_DNP = new CRC("CRC-16/DNP", 16, 0x3D65, 0x0000, true, true, 0xFFFF);
        public static CRC CRC16_EN_13757 = new CRC("CRC-16/EN-13757", 16, 0x3D65, 0x0000, false, false, 0xFFFF);
        public static CRC CRC16_GENIBUS = new CRC("CRC-16/GENIBUS", 16, 0x1021, 0xFFFF, false, false, 0xFFFF);
        public static CRC CRC16_MAXIM = new CRC("CRC-16/MAXIM", 16, 0x8005, 0x0000, true, true, 0xFFFF);
        public static CRC CRC16_MCRF4XX = new CRC("CRC-16/MCRF4XX", 16, 0x1021, 0xFFFF, true, true, 0x0000);
        public static CRC CRC16_RIELLO = new CRC("CRC-16/RIELLO", 16, 0x1021, 0xB2AA, true, true, 0x0000);
        public static CRC CRC16_T10_DIF = new CRC("CRC-16/T10-DIF", 16, 0x8BB7, 0x0000, false, false, 0x0000);
        public static CRC CRC16_TELEDISK = new CRC("CRC-16/TELEDISK", 16, 0xA097, 0x0000, false, false, 0x0000);
        public static CRC CRC16_TMS37157 = new CRC("CRC-16/TMS37157", 16, 0x1021, 0x89EC, true, true, 0x0000);
        public static CRC CRC16_USB = new CRC("CRC-16/USB", 16, 0x8005, 0xFFFF, true, true, 0xFFFF);
        public static CRC CRC16_A = new CRC("CRC-A", 16, 0x1021, 0xC6C6, true, true, 0x0000);
        public static CRC CRC16_KERMIT = new CRC("CRC-16/KERMIT", 16, 0x1021, 0x0000, true, true, 0x0000);
        public static CRC CRC16_MODBUS = new CRC("CRC-16/MODBUS", 16, 0x8005, 0xFFFF, true, true, 0x0000);
        public static CRC CRC16_X25 = new CRC("CRC-16/X-25", 16, 0x1021, 0xFFFF, true, true, 0xFFFF);
        public static CRC CRC16_XMODEM = new CRC("CRC-16/XMODEM", 16, 0x1021, 0x0000, false, false, 0x0000);

        public static CRC[] CRC16_All = {CRC16_CCITT_FALSE, CRC16_ARC, CRC16_AUG_CCITT, CRC16_BUYPASS, CRC16_CDMA2000, CRC16_DDS_110, CRC16_DECT_R,
                CRC16_DECT_X, CRC16_DNP, CRC16_EN_13757, CRC16_GENIBUS, CRC16_MAXIM, CRC16_MCRF4XX, CRC16_RIELLO, CRC16_T10_DIF,
                CRC16_TELEDISK, CRC16_TMS37157, CRC16_USB, CRC16_A, CRC16_KERMIT, CRC16_MODBUS, CRC16_X25, CRC16_XMODEM};*/

    public static void main(String[] args) {

        try
        {
            // CRC CRC_with_error = new CRC("CRC-with-error", 9, 0x07, 0x00, false, false, 0x00); // This is test string for try/catch

            CRC CRC8 = new CRC("CRC-8", 8, 0x07, 0x00, false, false, 0x00);
            CRC CRC8_CDMA2000 = new CRC("CRC-8/CDMA2000", 8, 0x9B, 0xFF, false, false, 0x00);
            CRC CRC8_DARC = new CRC("CRC-8/DARC", 8, 0x39, 0x00, true, true, 0x00);
            CRC CRC8_DVBS2 = new CRC("CRC-8/DVB-S2", 8, 0xD5, 0x00, false, false, 0x00);
            CRC CRC8_EBU = new CRC("CRC-8/EBU", 8, 0x1D, 0xFF, true, true, 0x00);
            CRC CRC8_ICODE = new CRC("CRC-8/ICODE", 8, 0x1D, 0xFD, false, false, 0x00);
            CRC CRC8_ITU = new CRC("CRC-8/ITU", 8, 0x07, 0x00, false, false, 0x55);
            CRC CRC8_MAXIM = new CRC("CRC-8/MAXIM", 8, 0x31, 0x00, true, true, 0x00);
            CRC CRC8_ROHC = new CRC("CRC-8/ROHC", 8, 0x07, 0xFF, true, true, 0x00);
            CRC CRC8_WCDMA = new CRC("CRC-8/WCDMA", 8, 0x9B, 0x00, true, true, 0x00);

            CRC[] CRC8_All = {CRC8, CRC8_CDMA2000, CRC8_DARC, CRC8_DVBS2, CRC8_EBU, CRC8_ICODE, CRC8_ITU, CRC8_MAXIM, CRC8_ROHC, CRC8_WCDMA};

            CRC CRC16_CCITT_FALSE = new CRC("CRC-16/CCITT-FALSE", 16, 0x1021, 0xFFFF, false, false, 0x0000);
            CRC CRC16_ARC = new CRC("CRC-16/ARC", 16, 0x8005, 0x0000, true, true, 0x0000);
            CRC CRC16_AUG_CCITT = new CRC("CRC-16/AUG-CCITT", 16, 0x1021, 0x1D0F, false, false, 0x0000);
            CRC CRC16_BUYPASS = new CRC("CRC-16/BUYPASS", 16, 0x8005, 0x0000, false, false, 0x0000);
            CRC CRC16_CDMA2000 = new CRC("CRC-16/CDMA2000", 16, 0xC867, 0xFFFF, false, false, 0x0000);
            CRC CRC16_DDS_110 = new CRC("CRC-16/DDS-110", 16, 0x8005, 0x800D, false, false, 0x0000);
            CRC CRC16_DECT_R = new CRC("CRC-16/DECT-R", 16, 0x0589, 0x0000, false, false, 0x0001);
            CRC CRC16_DECT_X = new CRC("CRC-16/DECT-X", 16, 0x0589, 0x0000, false, false, 0x0000);
            CRC CRC16_DNP = new CRC("CRC-16/DNP", 16, 0x3D65, 0x0000, true, true, 0xFFFF);
            CRC CRC16_EN_13757 = new CRC("CRC-16/EN-13757", 16, 0x3D65, 0x0000, false, false, 0xFFFF);
            CRC CRC16_GENIBUS = new CRC("CRC-16/GENIBUS", 16, 0x1021, 0xFFFF, false, false, 0xFFFF);
            CRC CRC16_MAXIM = new CRC("CRC-16/MAXIM", 16, 0x8005, 0x0000, true, true, 0xFFFF);
            CRC CRC16_MCRF4XX = new CRC("CRC-16/MCRF4XX", 16, 0x1021, 0xFFFF, true, true, 0x0000);
            CRC CRC16_RIELLO = new CRC("CRC-16/RIELLO", 16, 0x1021, 0xB2AA, true, true, 0x0000);
            CRC CRC16_T10_DIF = new CRC("CRC-16/T10-DIF", 16, 0x8BB7, 0x0000, false, false, 0x0000);
            CRC CRC16_TELEDISK = new CRC("CRC-16/TELEDISK", 16, 0xA097, 0x0000, false, false, 0x0000);
            CRC CRC16_TMS37157 = new CRC("CRC-16/TMS37157", 16, 0x1021, 0x89EC, true, true, 0x0000);
            CRC CRC16_USB = new CRC("CRC-16/USB", 16, 0x8005, 0xFFFF, true, true, 0xFFFF);
            CRC CRC16_A = new CRC("CRC-A", 16, 0x1021, 0xC6C6, true, true, 0x0000);
            CRC CRC16_KERMIT = new CRC("CRC-16/KERMIT", 16, 0x1021, 0x0000, true, true, 0x0000);
            CRC CRC16_MODBUS = new CRC("CRC-16/MODBUS", 16, 0x8005, 0xFFFF, true, true, 0x0000);
            CRC CRC16_X25 = new CRC("CRC-16/X-25", 16, 0x1021, 0xFFFF, true, true, 0xFFFF);
            CRC CRC16_XMODEM = new CRC("CRC-16/XMODEM", 16, 0x1021, 0x0000, false, false, 0x0000);

            CRC[] CRC16_All = {CRC16_CCITT_FALSE, CRC16_ARC, CRC16_AUG_CCITT, CRC16_BUYPASS, CRC16_CDMA2000, CRC16_DDS_110, CRC16_DECT_R,
                    CRC16_DECT_X, CRC16_DNP, CRC16_EN_13757, CRC16_GENIBUS, CRC16_MAXIM, CRC16_MCRF4XX, CRC16_RIELLO, CRC16_T10_DIF,
                    CRC16_TELEDISK, CRC16_TMS37157, CRC16_USB, CRC16_A, CRC16_KERMIT, CRC16_MODBUS, CRC16_X25, CRC16_XMODEM};

            CRC CRC_32          = new CRC("CRC-32",         32, 0x04C11DB7, 0xFFFFFFFF, true, true, 0xFFFFFFFF);
            CRC CRC_32_BZIP2    = new CRC("CRC-32/BZIP2",   32, 0x04C11DB7, 0xFFFFFFFF, false, false, 0xFFFFFFFF);

            CRC[] CRC32_All = {CRC_32, CRC_32_BZIP2};

//            for(int i = 0; i< CRC16_All.length; i++)
//            {
//                System.out.println(CRC16_All[i].getCRC_name());
//            }
            System.out.println();

            for(int i = 1; i<=256; i++)
            {
                if((i % 16 == 0 && i != 0) || i==16) System.out.println("0x" + Long.toHexString(CRC16_RIELLO.CRC16_R_Table[i-1]) + " ");
                else System.out.print("0x" + Long.toHexString(CRC16_RIELLO.CRC16_R_Table[i-1]) + " ");
            }
            System.out.println();

            for(int i = 1; i<=256; i++)
            {
                if((i % 16 == 0 && i != 0) || i==16) System.out.println("0x" + Long.toHexString(CRC_32.CRC32_R_Table[i-1]) + " ");
                else System.out.print("0x" + Long.toHexString(CRC_32.CRC32_R_Table[i-1]) + " ");
            }

            int[] buff = {0x12, 0x34, 0x56, 0x78, 0x09};

            System.out.println();
            System.out.println("Результат расчёта CRC " + CRC16_RIELLO.getCRC_name() + " значениея 0x12 0x34 0x56 0x78 0x09 равен 0х" + Long.toHexString(CRC16_RIELLO.CRC16Count(buff, buff.length)));
            System.out.println();

            for(int i = 0; i < CRC8_All.length; i++){
                System.out.println();
                System.out.println("Результат расчёта CRC " + CRC8_All[i].getCRC_name() + " значениея 0x12 0x34 0x56 0x78 0x09 равен 0х" + Long.toHexString(CRC8_All[i].CRC8Count(buff, buff.length)));
            }

            long a = 0xffffffff9823b6ffL;
            a = a & 0xFFFF_FFFFL;
            System.out.println();
            System.out.println(CRC8.toString());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("We got " + e.toString());
        }

    }
}
