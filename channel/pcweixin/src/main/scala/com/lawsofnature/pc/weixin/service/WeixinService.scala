package com.lawsofnature.pc.weixin.service

import com.jxjxgo.common.helper.UUIDHelper
import com.jxjxgo.pc.common.service.PCService
import com.jxjxgo.pc.rpc.domain._
import com.typesafe.config.ConfigFactory

/**
  * Created by fangzhongwei on 2017/1/18.
  */
trait WeixinService extends PCService {
}

class WeixinServiceImpl extends WeixinService {

  private val mchId: String = ConfigFactory.load().getString("wx.config.mch_id")
  private val defaultDeviceInfo: String = ConfigFactory.load().getString("wx.config.default.device_info")
  private val signType: String = ConfigFactory.load().getString("wx.config.sign_type")
  private val body: String = ConfigFactory.load().getString("wx.config.body")// product desc

  def generateSign(): String = ""

  override def sign(traceId: String, signRequest: SignRequest): SignResponse = {
    val params: Map[String, String]  = Map[String,String]()
    val appid: String = signRequest.ext1
    val nonceStr: String = UUIDHelper.generate()
    var sign:String = generateSign()
    SignResponse(code = "0")
  }

  override def callback(traceId: String, callbackRequest: CallbackRequest): CallbackResponse = ???

  override def download(traceId: String, downloadWaterRecordsRequest: DownloadWaterRecordsRequest): DownloadWaterRecordsResponse = ???

  override def query(traceId: String, queryRequest: QueryRequest): QueryResponse = ???
}
