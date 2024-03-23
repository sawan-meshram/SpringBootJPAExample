# SpringBootJPAExample

This project is used to demonstrate the **Spring Data JPA** module.

In this project, I have used some of annotation for implement ORM (Object Relation Mapping) framework. Such as 

- `@Entity`
- `@Id`
- `@GeneratedValue`
- `@Column`
- `@Table`


#### CrudRepository 
`CrudRepository` is an interface provided by **Spring Data JPA** that extends the `Repository` interface. It provides `CRUD (Create, Read, Update, Delete)` operations for working with entities in a **Spring Data JPA** based application.

##### @Query
In Spring Data JPA, the `@Query` annotation is used to define custom **JPQL (Java Persistence Query Language)** queries directly in the `repository` interface methods. This allows you to execute complex database queries using `JPQL` syntax.

Example,

1.

```
@Query("select u FROM User u")
public List<User> getAllUser();
```

2.

```
@Query("select u FROM User u WHERE u.name=:n")
public List<User> getUserByName(@Param("n") String name);
```

##### Example on native query using `@Query`

```
@Query(value="select * from user", nativeQuery = true)
public List<User> getUsers();
```


