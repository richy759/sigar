package net.hyperic.sigar.win32;

import net.hyperic.sigar.Sigar;
import net.hyperic.sigar.SigarException;

abstract class Win32 {

    static int SUCCESS = 0;
    
    static {
        try {
            Sigar.load();
        } catch (SigarException e) {
            
        }
    }
    
    static native String GetErrorMessage(int error);

    static native int GetLastError();

}
