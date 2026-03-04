package pingu.packet

import pingu.isJP
import pingu.netty.PKT

val channelSize = if (!isJP) 5 else 1
// server = CChannelCache::MakeStatePacket
fun ChannelsState() = PKT {
    Encode2(channelSize)

    repeat(channelSize) { i ->
        Encode2() // 開啟 = 0 關閉 = -1
    }
}