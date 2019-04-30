package com.exa.lang.parsing;

import com.exa.expression.VariableContext;
import com.exa.expression.XPOperand;
import com.exa.expression.eval.XPEvaluator;
import com.exa.utils.ManagedException;
import com.exa.utils.values.ObjectValue;
import com.exa.utils.values.Value;

public interface ComputingStatement {
	ObjectValue<XPOperand<?>> compileObject(Computing computing, String context) throws ManagedException;
	
	Value<?, XPOperand<?>> translate(ObjectValue<XPOperand<?>> ov, XPEvaluator evaluator, VariableContext ovc) throws ManagedException;
}
