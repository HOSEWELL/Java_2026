package com.github.hosewell.lambda;

public class PptExport implements Export {

    @Override
    public void export(String content) {
        System.out.println("Exporting to Power Point " + content);
    }

}
