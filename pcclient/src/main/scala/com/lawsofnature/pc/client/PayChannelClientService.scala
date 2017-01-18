package com.lawsofnature.pc.client

import javax.inject.{Inject, Named}

import RpcPC._
import com.lawsofnatrue.common.ice.IcePrxFactory
import org.slf4j.LoggerFactory

/**
  * Created by fangzhongwei on 2017/1/18.
  */
trait PayChannelClientService {
  def initClient

  def sign(traceId: String, request: SignRequest): SignResponse

  def callback(traceId: String, request: CallbackRequest): CallbackResponse

  def query(traceId: String, request: QueryRequest): QueryResponse

  def download(traceId: String, request: DownloadWaterRecordsRequest): DownloadWaterRecordsResponse
}

class PayChannelClientServiceImpl @Inject()(@Named("pc.ice.client.init.config") iceInitConfig: String,
                                            @Named("pc.ice.client.init.size") iceInitSizeConfig: String,
                                            @Named("pc.ice.client.init.size-max") iceInitSizeMaxConfig: String,
                                            @Named("pc.ice.client.init.size-warn") iceInitSizeWarnConfig: String,
                                            @Named("pc.ice.client.proxy.config") proxyConfig: String,
                                            icePrxFactory: IcePrxFactory) extends PayChannelClientService {
  val logger = LoggerFactory.getLogger(this.getClass)

  var accountEndpoint: PCEndpointPrx = _

  override def initClient = accountEndpoint = icePrxFactory.make[PCEndpointPrx](Array[String](iceInitConfig, iceInitSizeConfig, iceInitSizeMaxConfig, iceInitSizeWarnConfig), proxyConfig, PCEndpointPrxHelper.checkedCast)

  override def sign(traceId: String, request: SignRequest): SignResponse = accountEndpoint.sign(traceId, request)

  override def callback(traceId: String, request: CallbackRequest): CallbackResponse = accountEndpoint.callback(traceId, request)

  override def query(traceId: String, request: QueryRequest): QueryResponse = accountEndpoint.query(traceId, request)

  override def download(traceId: String, request: DownloadWaterRecordsRequest): DownloadWaterRecordsResponse = accountEndpoint.download(traceId, request)
}
