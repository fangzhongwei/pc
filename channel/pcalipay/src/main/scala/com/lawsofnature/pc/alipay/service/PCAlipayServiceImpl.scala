package com.lawsofnature.pc.alipay.service

import javax.inject.Inject

import com.jxjxgo.common.exception.{ErrorCode, ServiceException}
import com.jxjxgo.pc.rpc.domain._
import com.twitter.util.Future

/**
  * Created by fangzhongwei on 2017/1/18.
  */
class PCAlipayServiceImpl @Inject()(alipayService: AlipayService) extends PCEndpoint[Future] {
  override def sign(traceId: String, signRequest: SignRequest): Future[SignResponse] = {
    try {
      Future.value(alipayService.sign(traceId, signRequest))
    } catch {
      case ex: ServiceException =>
        Future.value(SignResponse(code = ex.getErrorCode.getCode))
      case ex: Exception =>
        Future.value(SignResponse(code = ErrorCode.EC_SYSTEM_ERROR.getCode))
    }
  }

  override def callback(traceId: String, callbackRequest: CallbackRequest): Future[CallbackResponse] = {
    try {
      Future.value(alipayService.callback(traceId, callbackRequest))
    } catch {
      case ex: ServiceException =>
        Future.value(CallbackResponse(code = ex.getErrorCode.getCode))
      case ex: Exception =>
        Future.value(CallbackResponse(code = ErrorCode.EC_SYSTEM_ERROR.getCode))
    }
  }

  override def query(traceId: String, queryRequest: QueryRequest): Future[QueryResponse] = {
    try {
      Future.value(alipayService.query(traceId, queryRequest))
    } catch {
      case ex: ServiceException =>
        Future.value(QueryResponse(code = ex.getErrorCode.getCode))
      case ex: Exception =>
        Future.value(QueryResponse(code = ErrorCode.EC_SYSTEM_ERROR.getCode))
    }
  }

  override def download(traceId: String, downloadWaterRecordsRequest: DownloadWaterRecordsRequest): Future[DownloadWaterRecordsResponse] = {
    try {
      Future.value(alipayService.download(traceId, downloadWaterRecordsRequest))
    } catch {
      case ex: ServiceException =>
        Future.value(DownloadWaterRecordsResponse(code = ex.getErrorCode.getCode))
      case ex: Exception =>
        Future.value(DownloadWaterRecordsResponse(code = ErrorCode.EC_SYSTEM_ERROR.getCode))
    }
  }

}
