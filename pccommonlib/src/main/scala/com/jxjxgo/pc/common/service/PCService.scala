package com.jxjxgo.pc.common.service

import com.jxjxgo.pc.rpc.domain._

/**
  * Created by fangzhongwei on 2017/2/5.
  */
trait PCService {
  def sign(traceId: String, signRequest: SignRequest): SignResponse

  def callback(traceId: String, callbackRequest: CallbackRequest): CallbackResponse

  def query(traceId: String, queryRequest: QueryRequest): QueryResponse

  def download(traceId: String, downloadWaterRecordsRequest: DownloadWaterRecordsRequest): DownloadWaterRecordsResponse
}
