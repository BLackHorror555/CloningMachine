package cloningfactory;

/**
 * Interface for cloning itself.
 *
 * <p>
 *     Although every  java already has {@link Cloneable} interface,
 *     but still need a new one for the task as I understood.
 * </p>
 */
public interface CloningMachine {
    Object makeClone();
}
