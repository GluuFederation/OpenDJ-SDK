/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE
 * or https://OpenDS.dev.java.net/OpenDS.LICENSE.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at
 * trunk/opends/resource/legal-notices/OpenDS.LICENSE.  If applicable,
 * add the following below this CDDL HEADER, with the fields enclosed
 * by brackets "[]" replaced with your own identifying information:
 *      Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 *
 *      Portions Copyright 2006-2007 Sun Microsystems, Inc.
 */
package org.opends.server.types;
import org.opends.messages.Message;



/**
 * This class defines an exception that may be thrown if the operation
 * being processed is cancelled for some reason (e.g., an abandon or
 * cancel request from the client).
 */
@org.opends.server.types.PublicAPI(
     stability=org.opends.server.types.StabilityLevel.UNCOMMITTED,
     mayInstantiate=true,
     mayExtend=false,
     mayInvoke=true)
public final class CancelledOperationException
       extends IdentifiedException
{
  /**
   * The serial version identifier required to satisfy the compiler
   * because this class extends <CODE>java.lang.Exception</CODE>,
   * which implements the <CODE>java.io.Serializable</CODE> interface.
   * This value was generated using the <CODE>serialver</CODE>
   * command-line utility included with the Java SDK.
   */
  private static final long serialVersionUID = -1936491673256446966L;



  // The cancel result that provides information about the status of
  // the cancellation.
  private final CancelResult cancelResult;



  /**
   * Creates a new cancelled operation exception with the provided
   * result and no additional message.
   *
   * @param  cancelResult  The result of the cancel processing.
   */
  public CancelledOperationException(CancelResult cancelResult)
  {
    super();


    this.cancelResult = cancelResult;
  }



  /**
   * Creates a new cancelled operation exception with the provided
   * information.
   *
   * @param  cancelResult  The result of the cancel processing.
   * @param  message       The message providing additional
   *                       information about the cancel processing, or
   *                       <CODE>null</CODE> if there is no message.
   */
  public CancelledOperationException(CancelResult cancelResult,
                                     Message message)
  {
    super(message);


    this.cancelResult = cancelResult;
  }



  /**
   * Retrieves the cancel result for this cancelled operation
   * exception.
   *
   * @return  The cancel result for this cancelled operation
   *          exception.
   */
  public CancelResult getCancelResult()
  {
    return cancelResult;
  }
}

