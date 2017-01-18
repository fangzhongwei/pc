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

public final class QueryRequestHolder extends Ice.ObjectHolderBase<QueryRequest>
{
    public
    QueryRequestHolder()
    {
    }

    public
    QueryRequestHolder(QueryRequest value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof QueryRequest)
        {
            value = (QueryRequest)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return QueryRequest.ice_staticId();
    }
}
