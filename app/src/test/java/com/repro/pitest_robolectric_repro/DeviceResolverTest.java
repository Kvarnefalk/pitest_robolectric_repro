package com.repro.pitest_robolectric_repro;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Example local unit test, which will execute on the development machine (host).
 */
@RunWith(RobolectricTestRunner.class)
public class DeviceResolverTest {

    private DeviceResolver mDeviceResolver;
    @Test
    public void tmp1() {
        mDeviceResolver = new DeviceResolver();
        boolean resp = mDeviceResolver.isValidDeviceNameForChromebook("random_string");
        Assert.assertTrue(resp);
    }
    @Test
    public void tmp2() {
        mDeviceResolver = new DeviceResolver();
        boolean resp = mDeviceResolver.isValidDeviceNameForChromebook(null);
        Assert.assertFalse(resp);
    }
}