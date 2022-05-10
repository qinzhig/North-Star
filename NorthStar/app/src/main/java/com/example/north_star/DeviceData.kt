package com.example.north_star

/**
 * Team: Visibility
 *
 * @author: zhiguo.qin@flexport.com
 *
 * @createDate: 2022/5/10
 *
 * @description
 */
data class DeviceData(val deviceName: String?, val deviceHardwareAddress: String){
    override fun equals(other: Any?): Boolean {
        val deviceData = other as DeviceData
        return deviceHardwareAddress == deviceData.deviceHardwareAddress
    }

    override fun hashCode(): Int {
        return deviceHardwareAddress.hashCode()
    }
}
