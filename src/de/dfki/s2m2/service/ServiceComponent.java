package de.dfki.s2m2.service;

// TODO

public abstract class ServiceComponent {
	
	public class ComponentType {
		
		private ComponentType() {
		};
		
		// TODO Define default types
		public static final String		INPUT = "Input";
		
		public static final String		OUTPUT = "Output";
		
		public static final String		PRECONDITION = "Precondition";
		
		public static final String		EFFECT = "Effect";
		
		public static final String		DESCRIPTION = "Description";
	}
		
	protected String				componentType;
	
	public ServiceComponent(String componentType) {
		this.componentType = componentType;
	}
	
	/**
	 * Returns the component type. This may be one of the predefined constants of <code>ServiceComponent</code>.
	 * 
	 * @return String representation of the component type.
	 */
	public String getComponentType() {
		return componentType;
	}
	
	public boolean hasCharacteristic(Class<? extends ServiceComponent> specificClass) {
		return specificClass.equals(this.getClass());
	}
	
	@SuppressWarnings("unchecked")
	public <T extends ServiceComponent> T castTo(Class<T> type) throws ClassCastException {
		return (T) this;
	}
}
