package com.realestate.service;

import com.realestate.model.Property;
import com.realestate.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService implements ManagementService<Property> {

    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property create(Property property) {
        return propertyRepository.save(property);
    }

    @Override
    public List<Property> getAll() {
        return propertyRepository.findAll();
    }

    @Override
    public Property getById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }

    @Override
    public Property update(Long id, Property newProperty) {
        Property oldProperty = propertyRepository.findById(id).orElse(null);

        if (oldProperty != null) {
            oldProperty.setPropertyName(newProperty.getPropertyName());
            oldProperty.setLocation(newProperty.getLocation());
            oldProperty.setPrice(newProperty.getPrice());
            oldProperty.setPropertyType(newProperty.getPropertyType());
            oldProperty.setDescription(newProperty.getDescription());
            oldProperty.setCreatedBy(newProperty.getCreatedBy());

            return propertyRepository.save(oldProperty);
        }

        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (propertyRepository.existsById(id)) {
            propertyRepository.deleteById(id);
            return true;
        }

        return false;
    }
}