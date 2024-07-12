/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.ConsistencyPackage
 * @generated
 */
public class ConsistencyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConsistencyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConsistencyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsistencySwitch<Adapter> modelSwitch =
		new ConsistencySwitch<Adapter>() {
			@Override
			public Adapter caseIHasId(IHasId object) {
				return createIHasIdAdapter();
			}
			@Override
			public Adapter caseIHasName(IHasName object) {
				return createIHasNameAdapter();
			}
			@Override
			public Adapter caseIHasComment(IHasComment object) {
				return createIHasCommentAdapter();
			}
			@Override
			public Adapter caseIHasIdAndName(IHasIdAndName object) {
				return createIHasIdAndNameAdapter();
			}
			@Override
			public Adapter caseBasicElementInformation(BasicElementInformation object) {
				return createBasicElementInformationAdapter();
			}
			@Override
			public Adapter caseRelationTargetInformation(RelationTargetInformation object) {
				return createRelationTargetInformationAdapter();
			}
			@Override
			public Adapter caseAbstractElementRelation(AbstractElementRelation object) {
				return createAbstractElementRelationAdapter();
			}
			@Override
			public Adapter caseRuleElement(RuleElement object) {
				return createRuleElementAdapter();
			}
			@Override
			public Adapter caseRuleCondition(RuleCondition object) {
				return createRuleConditionAdapter();
			}
			@Override
			public Adapter caseConsistencyRule(ConsistencyRule object) {
				return createConsistencyRuleAdapter();
			}
			@Override
			public Adapter caseConsistencyViolation(ConsistencyViolation object) {
				return createConsistencyViolationAdapter();
			}
			@Override
			public Adapter caseContextWrapper(ContextWrapper object) {
				return createContextWrapperAdapter();
			}
			@Override
			public Adapter caseStringToElementMapEntry(Map.Entry<String, EObject> object) {
				return createStringToElementMapEntryAdapter();
			}
			@Override
			public Adapter caseConfidentialityStatus(ConfidentialityStatus object) {
				return createConfidentialityStatusAdapter();
			}
			@Override
			public Adapter caseFeedbackLevelClearance(FeedbackLevelClearance object) {
				return createFeedbackLevelClearanceAdapter();
			}
			@Override
			public Adapter caseClearance(Clearance object) {
				return createClearanceAdapter();
			}
			@Override
			public Adapter caseExceptionEntry(ExceptionEntry object) {
				return createExceptionEntryAdapter();
			}
			@Override
			public Adapter caseExceptionAttribute(ExceptionAttribute object) {
				return createExceptionAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.IHasId <em>IHas Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.IHasId
	 * @generated
	 */
	public Adapter createIHasIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.IHasName <em>IHas Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.IHasName
	 * @generated
	 */
	public Adapter createIHasNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.IHasComment <em>IHas Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.IHasComment
	 * @generated
	 */
	public Adapter createIHasCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.IHasIdAndName <em>IHas Id And Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.IHasIdAndName
	 * @generated
	 */
	public Adapter createIHasIdAndNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.BasicElementInformation <em>Basic Element Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.BasicElementInformation
	 * @generated
	 */
	public Adapter createBasicElementInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.RelationTargetInformation <em>Relation Target Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.RelationTargetInformation
	 * @generated
	 */
	public Adapter createRelationTargetInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.AbstractElementRelation <em>Abstract Element Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.AbstractElementRelation
	 * @generated
	 */
	public Adapter createAbstractElementRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.RuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.RuleElement
	 * @generated
	 */
	public Adapter createRuleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.RuleCondition <em>Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.RuleCondition
	 * @generated
	 */
	public Adapter createRuleConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.ConsistencyRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.ConsistencyRule
	 * @generated
	 */
	public Adapter createConsistencyRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.ConsistencyViolation <em>Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.ConsistencyViolation
	 * @generated
	 */
	public Adapter createConsistencyViolationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.ContextWrapper <em>Context Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.ContextWrapper
	 * @generated
	 */
	public Adapter createContextWrapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Element Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToElementMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.ConfidentialityStatus <em>Confidentiality Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.ConfidentialityStatus
	 * @generated
	 */
	public Adapter createConfidentialityStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.FeedbackLevelClearance <em>Feedback Level Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.FeedbackLevelClearance
	 * @generated
	 */
	public Adapter createFeedbackLevelClearanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.Clearance <em>Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.Clearance
	 * @generated
	 */
	public Adapter createClearanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.ExceptionEntry <em>Exception Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.ExceptionEntry
	 * @generated
	 */
	public Adapter createExceptionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.ExceptionAttribute <em>Exception Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.ExceptionAttribute
	 * @generated
	 */
	public Adapter createExceptionAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConsistencyAdapterFactory
