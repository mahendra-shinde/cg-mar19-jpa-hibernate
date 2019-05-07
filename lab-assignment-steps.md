## Steps to finish LAB
1. New JPA Project

2. Add External JAR

3. Copy "persistence.xml" from previous project

4. Execute SQL Query to create required table

		CREATE TABLE author
		 (
			 authorid number(6) PRIMARY KEY,
			 firstname varchar2(25),
			 middlename varchar2(25),
			 lastname varchar2(25),
			 phoneno varchar2(10)
		 );

5. Create ENTITY class for required table

		public class Author{
			private Integer authorId;
			private String firstName;
			private String lastName;
			private String middleName;
			private String phoneNo;
			//GETTER & SETTERS
		}

6. Add annotations to ENTITY class


		@Entity			Mandatory Annotation, mark current class as
					ENTITY mapped to TABLE
		@Table			Optional annotation, provide "TABLE" name
					If Skipped, Classname becomes TABLE NAME
		@Id			Mandatory Annotation, Set Primary KEY 
		@GeneratedValue		Automatic Value Generation
					WORKS great with MySQL, MSSQL 
					But requires ADDITIONAL CONFIG for Oracle DB
		@Column			Optional Annotation, set column name and
					constraints
		@Temporal		Contextual (Required only for Data/Time)
					ex.
					@Temporal(temporalType=DATE)
					private Date dob;

7. Open "Persistence.xml" and change name of ENTITY class

		<class>com.cg.jpastart.entities.Author</class>

8. Create / Copy JPAUtil class

		public class JPAUtil {

			private static EntityManagerFactory factory;
			private static EntityManager entityManager;
			
			static {
				factory = Persistence.createEntityManagerFactory("JPA-PU");
			}
			
			public static EntityManager getEntityManager() {
				if(entityManager==null || !entityManager.isOpen()) {
					entityManager = factory.createEntityManager();
				}
				return entityManager;
			}
			
		}


9. Create New DAO Interface and DAO Implementation class

		public interface AuthorDAO{
			void save(Author author);
			Author findById(Integer authorId);
			void update(Author author);
			void delete(Author author);
		}

10. Add methods for CREATE, RETRIEVE, UPDATE & DELETE

		public class AuthorDAOImpl implements AuthorDAO{
			//Implement all methods here
		}
