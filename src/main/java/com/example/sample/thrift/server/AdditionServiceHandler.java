//**********************************************************************
// Copyright (c) 2017 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
package com.example.sample.thrift.server;

import org.apache.thrift.TException;

public class AdditionServiceHandler implements AdditionService.Iface
{

    public int add(int n1, int n2) throws TException
    {
        return n1 + n2;
    }

}
