// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `pc.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RpcPC;

/**
 * Provides type-specific helper functions.
 **/
public final class PCEndpointPrxHelper extends Ice.ObjectPrxHelperBase implements PCEndpointPrx
{
    private static final String __callback_name = "callback";

    public CallbackResponse callback(String traceId, CallbackRequest request)
    {
        return callback(traceId, request, null, false);
    }

    public CallbackResponse callback(String traceId, CallbackRequest request, java.util.Map<String, String> __ctx)
    {
        return callback(traceId, request, __ctx, true);
    }

    private CallbackResponse callback(String traceId, CallbackRequest request, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__callback_name);
        return end_callback(begin_callback(traceId, request, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_callback(String traceId, CallbackRequest request)
    {
        return begin_callback(traceId, request, null, false, false, null);
    }

    public Ice.AsyncResult begin_callback(String traceId, CallbackRequest request, java.util.Map<String, String> __ctx)
    {
        return begin_callback(traceId, request, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_callback(String traceId, CallbackRequest request, Ice.Callback __cb)
    {
        return begin_callback(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_callback(String traceId, CallbackRequest request, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_callback(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_callback(String traceId, CallbackRequest request, Callback_PCEndpoint_callback __cb)
    {
        return begin_callback(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_callback(String traceId, CallbackRequest request, java.util.Map<String, String> __ctx, Callback_PCEndpoint_callback __cb)
    {
        return begin_callback(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_callback(String traceId, 
                                          CallbackRequest request, 
                                          IceInternal.Functional_GenericCallback1<CallbackResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_callback(traceId, request, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_callback(String traceId, 
                                          CallbackRequest request, 
                                          IceInternal.Functional_GenericCallback1<CallbackResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_callback(traceId, request, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_callback(String traceId, 
                                          CallbackRequest request, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<CallbackResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_callback(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_callback(String traceId, 
                                          CallbackRequest request, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<CallbackResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_callback(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_callback(String traceId, 
                                           CallbackRequest request, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_GenericCallback1<CallbackResponse> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_callback(traceId, request, __ctx, __explicitCtx, __synchronous, 
                              new IceInternal.Functional_TwowayCallbackArg1<RpcPC.CallbackResponse>(__responseCb, __exceptionCb, __sentCb)
                                  {
                                      public final void __completed(Ice.AsyncResult __result)
                                      {
                                          PCEndpointPrxHelper.__callback_completed(this, __result);
                                      }
                                  });
    }

    private Ice.AsyncResult begin_callback(String traceId, 
                                           CallbackRequest request, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__callback_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__callback_name, __cb);
        try
        {
            __result.prepare(__callback_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(traceId);
            __os.writeObject(request);
            __os.writePendingObjects();
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public CallbackResponse end_callback(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __callback_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            CallbackResponseHolder __ret = new CallbackResponseHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.endReadParams();
            return __ret.value;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __callback_completed(Ice.TwowayCallbackArg1<CallbackResponse> __cb, Ice.AsyncResult __result)
    {
        PCEndpointPrx __proxy = (PCEndpointPrx)__result.getProxy();
        CallbackResponse __ret = null;
        try
        {
            __ret = __proxy.end_callback(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __download_name = "download";

    public DownloadWaterRecordsResponse download(String traceId, DownloadWaterRecordsRequest request)
    {
        return download(traceId, request, null, false);
    }

    public DownloadWaterRecordsResponse download(String traceId, DownloadWaterRecordsRequest request, java.util.Map<String, String> __ctx)
    {
        return download(traceId, request, __ctx, true);
    }

    private DownloadWaterRecordsResponse download(String traceId, DownloadWaterRecordsRequest request, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__download_name);
        return end_download(begin_download(traceId, request, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_download(String traceId, DownloadWaterRecordsRequest request)
    {
        return begin_download(traceId, request, null, false, false, null);
    }

    public Ice.AsyncResult begin_download(String traceId, DownloadWaterRecordsRequest request, java.util.Map<String, String> __ctx)
    {
        return begin_download(traceId, request, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_download(String traceId, DownloadWaterRecordsRequest request, Ice.Callback __cb)
    {
        return begin_download(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_download(String traceId, DownloadWaterRecordsRequest request, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_download(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_download(String traceId, DownloadWaterRecordsRequest request, Callback_PCEndpoint_download __cb)
    {
        return begin_download(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_download(String traceId, DownloadWaterRecordsRequest request, java.util.Map<String, String> __ctx, Callback_PCEndpoint_download __cb)
    {
        return begin_download(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_download(String traceId, 
                                          DownloadWaterRecordsRequest request, 
                                          IceInternal.Functional_GenericCallback1<DownloadWaterRecordsResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_download(traceId, request, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_download(String traceId, 
                                          DownloadWaterRecordsRequest request, 
                                          IceInternal.Functional_GenericCallback1<DownloadWaterRecordsResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_download(traceId, request, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_download(String traceId, 
                                          DownloadWaterRecordsRequest request, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<DownloadWaterRecordsResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_download(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_download(String traceId, 
                                          DownloadWaterRecordsRequest request, 
                                          java.util.Map<String, String> __ctx, 
                                          IceInternal.Functional_GenericCallback1<DownloadWaterRecordsResponse> __responseCb, 
                                          IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                          IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_download(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_download(String traceId, 
                                           DownloadWaterRecordsRequest request, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.Functional_GenericCallback1<DownloadWaterRecordsResponse> __responseCb, 
                                           IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                           IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_download(traceId, request, __ctx, __explicitCtx, __synchronous, 
                              new IceInternal.Functional_TwowayCallbackArg1<DownloadWaterRecordsResponse>(__responseCb, __exceptionCb, __sentCb)
                                  {
                                      public final void __completed(Ice.AsyncResult __result)
                                      {
                                          PCEndpointPrxHelper.__download_completed(this, __result);
                                      }
                                  });
    }

    private Ice.AsyncResult begin_download(String traceId, 
                                           DownloadWaterRecordsRequest request, 
                                           java.util.Map<String, String> __ctx, 
                                           boolean __explicitCtx, 
                                           boolean __synchronous, 
                                           IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__download_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__download_name, __cb);
        try
        {
            __result.prepare(__download_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(traceId);
            __os.writeObject(request);
            __os.writePendingObjects();
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public DownloadWaterRecordsResponse end_download(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __download_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            DownloadWaterRecordsResponseHolder __ret = new DownloadWaterRecordsResponseHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.endReadParams();
            return __ret.value;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __download_completed(Ice.TwowayCallbackArg1<DownloadWaterRecordsResponse> __cb, Ice.AsyncResult __result)
    {
        PCEndpointPrx __proxy = (PCEndpointPrx)__result.getProxy();
        DownloadWaterRecordsResponse __ret = null;
        try
        {
            __ret = __proxy.end_download(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __query_name = "query";

    public QueryResponse query(String traceId, QueryRequest request)
    {
        return query(traceId, request, null, false);
    }

    public QueryResponse query(String traceId, QueryRequest request, java.util.Map<String, String> __ctx)
    {
        return query(traceId, request, __ctx, true);
    }

    private QueryResponse query(String traceId, QueryRequest request, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__query_name);
        return end_query(begin_query(traceId, request, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_query(String traceId, QueryRequest request)
    {
        return begin_query(traceId, request, null, false, false, null);
    }

    public Ice.AsyncResult begin_query(String traceId, QueryRequest request, java.util.Map<String, String> __ctx)
    {
        return begin_query(traceId, request, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_query(String traceId, QueryRequest request, Ice.Callback __cb)
    {
        return begin_query(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_query(String traceId, QueryRequest request, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_query(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_query(String traceId, QueryRequest request, Callback_PCEndpoint_query __cb)
    {
        return begin_query(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_query(String traceId, QueryRequest request, java.util.Map<String, String> __ctx, Callback_PCEndpoint_query __cb)
    {
        return begin_query(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_query(String traceId, 
                                       QueryRequest request, 
                                       IceInternal.Functional_GenericCallback1<QueryResponse> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_query(traceId, request, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_query(String traceId, 
                                       QueryRequest request, 
                                       IceInternal.Functional_GenericCallback1<QueryResponse> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_query(traceId, request, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_query(String traceId, 
                                       QueryRequest request, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<QueryResponse> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_query(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_query(String traceId, 
                                       QueryRequest request, 
                                       java.util.Map<String, String> __ctx, 
                                       IceInternal.Functional_GenericCallback1<QueryResponse> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_query(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_query(String traceId, 
                                        QueryRequest request, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.Functional_GenericCallback1<QueryResponse> __responseCb, 
                                        IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                        IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_query(traceId, request, __ctx, __explicitCtx, __synchronous, 
                           new IceInternal.Functional_TwowayCallbackArg1<RpcPC.QueryResponse>(__responseCb, __exceptionCb, __sentCb)
                               {
                                   public final void __completed(Ice.AsyncResult __result)
                                   {
                                       PCEndpointPrxHelper.__query_completed(this, __result);
                                   }
                               });
    }

    private Ice.AsyncResult begin_query(String traceId, 
                                        QueryRequest request, 
                                        java.util.Map<String, String> __ctx, 
                                        boolean __explicitCtx, 
                                        boolean __synchronous, 
                                        IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__query_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__query_name, __cb);
        try
        {
            __result.prepare(__query_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(traceId);
            __os.writeObject(request);
            __os.writePendingObjects();
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public QueryResponse end_query(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __query_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            QueryResponseHolder __ret = new QueryResponseHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.endReadParams();
            return __ret.value;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __query_completed(Ice.TwowayCallbackArg1<QueryResponse> __cb, Ice.AsyncResult __result)
    {
        PCEndpointPrx __proxy = (PCEndpointPrx)__result.getProxy();
        QueryResponse __ret = null;
        try
        {
            __ret = __proxy.end_query(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    private static final String __sign_name = "sign";

    public SignResponse sign(String traceId, SignRequest request)
    {
        return sign(traceId, request, null, false);
    }

    public SignResponse sign(String traceId, SignRequest request, java.util.Map<String, String> __ctx)
    {
        return sign(traceId, request, __ctx, true);
    }

    private SignResponse sign(String traceId, SignRequest request, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__sign_name);
        return end_sign(begin_sign(traceId, request, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_sign(String traceId, SignRequest request)
    {
        return begin_sign(traceId, request, null, false, false, null);
    }

    public Ice.AsyncResult begin_sign(String traceId, SignRequest request, java.util.Map<String, String> __ctx)
    {
        return begin_sign(traceId, request, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_sign(String traceId, SignRequest request, Ice.Callback __cb)
    {
        return begin_sign(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sign(String traceId, SignRequest request, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_sign(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sign(String traceId, SignRequest request, Callback_PCEndpoint_sign __cb)
    {
        return begin_sign(traceId, request, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_sign(String traceId, SignRequest request, java.util.Map<String, String> __ctx, Callback_PCEndpoint_sign __cb)
    {
        return begin_sign(traceId, request, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_sign(String traceId, 
                                      SignRequest request, 
                                      IceInternal.Functional_GenericCallback1<SignResponse> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sign(traceId, request, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sign(String traceId, 
                                      SignRequest request, 
                                      IceInternal.Functional_GenericCallback1<SignResponse> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sign(traceId, request, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_sign(String traceId, 
                                      SignRequest request, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_GenericCallback1<SignResponse> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_sign(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_sign(String traceId, 
                                      SignRequest request, 
                                      java.util.Map<String, String> __ctx, 
                                      IceInternal.Functional_GenericCallback1<SignResponse> __responseCb, 
                                      IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                      IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sign(traceId, request, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_sign(String traceId, 
                                       SignRequest request, 
                                       java.util.Map<String, String> __ctx, 
                                       boolean __explicitCtx, 
                                       boolean __synchronous, 
                                       IceInternal.Functional_GenericCallback1<SignResponse> __responseCb, 
                                       IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                       IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_sign(traceId, request, __ctx, __explicitCtx, __synchronous, 
                          new IceInternal.Functional_TwowayCallbackArg1<RpcPC.SignResponse>(__responseCb, __exceptionCb, __sentCb)
                              {
                                  public final void __completed(Ice.AsyncResult __result)
                                  {
                                      PCEndpointPrxHelper.__sign_completed(this, __result);
                                  }
                              });
    }

    private Ice.AsyncResult begin_sign(String traceId, 
                                       SignRequest request, 
                                       java.util.Map<String, String> __ctx, 
                                       boolean __explicitCtx, 
                                       boolean __synchronous, 
                                       IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__sign_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__sign_name, __cb);
        try
        {
            __result.prepare(__sign_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(traceId);
            __os.writeObject(request);
            __os.writePendingObjects();
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public SignResponse end_sign(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __sign_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            SignResponseHolder __ret = new SignResponseHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.endReadParams();
            return __ret.value;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __sign_completed(Ice.TwowayCallbackArg1<SignResponse> __cb, Ice.AsyncResult __result)
    {
        PCEndpointPrx __proxy = (PCEndpointPrx)__result.getProxy();
        SignResponse __ret = null;
        try
        {
            __ret = __proxy.end_sign(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PCEndpointPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), PCEndpointPrx.class, PCEndpointPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PCEndpointPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), PCEndpointPrx.class, PCEndpointPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PCEndpointPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), PCEndpointPrx.class, PCEndpointPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static PCEndpointPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), PCEndpointPrx.class, PCEndpointPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static PCEndpointPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, PCEndpointPrx.class, PCEndpointPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static PCEndpointPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, PCEndpointPrx.class, PCEndpointPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::RpcPC::PCEndpoint"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, PCEndpointPrx v)
    {
        __os.writeProxy(v);
    }

    public static PCEndpointPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PCEndpointPrxHelper result = new PCEndpointPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}