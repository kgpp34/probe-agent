package com.dlut;

import com.dlut.service.ProbeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "[main]:enter to main function" );
        ProbeService probeService = new ProbeService();
        probeService.doProbe();
        System.out.println("[main]:exit main function");
    }
}
