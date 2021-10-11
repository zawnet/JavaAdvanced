package opp.annotations;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Metamodel<T> {

    private final Class<T> metamodelClass;

    public Metamodel(Class<T> metamodelClass) {
        this.metamodelClass = metamodelClass;
    }

    public PrimaryKeyField getPrimaryKey(){
        Field[] fields = metamodelClass.getDeclaredFields();
        for (Field field : fields){
            PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
            if (primaryKey != null){
                PrimaryKeyField primaryKeyField = new PrimaryKeyField(field);
                return primaryKeyField;
            }
        }
        throw  new IllegalArgumentException("No primary key found in class "+ metamodelClass.getName());
    }

    public List getColumns(){
        List<ColumnField> columnFields = new ArrayList<>();
        Field[] fields = metamodelClass.getDeclaredFields();
        for (Field field : fields){
            Column collumn = field.getAnnotation(Column.class);
            if(collumn != null){
                ColumnField columnField = new ColumnField(field);
                columnFields.add(columnField);
            }
        }
        return columnFields;
    }
}
