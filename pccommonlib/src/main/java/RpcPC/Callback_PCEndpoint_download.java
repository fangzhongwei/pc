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

public abstract class Callback_PCEndpoint_download
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<DownloadWaterRecordsResponse>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        PCEndpointPrxHelper.__download_completed(this, __result);
    }
}
