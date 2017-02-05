package com.lawsofnature.pc.alipay.service

import com.jxjxgo.pc.rpc.domain._
import com.jxjxgo.pc.common.service.PCService

/**
  * Created by fangzhongwei on 2017/1/18.
  */
trait AlipayService extends PCService{
}

class AlipayServiceImpl extends AlipayService {
  override def sign(traceId: String, signRequest: SignRequest): SignResponse = ???

  override def callback(traceId: String, callbackRequest: CallbackRequest): CallbackResponse = ???

  override def query(traceId: String, queryRequest: QueryRequest): QueryResponse = ???

  override def download(traceId: String, downloadWaterRecordsRequest: DownloadWaterRecordsRequest): DownloadWaterRecordsResponse = ???
}
