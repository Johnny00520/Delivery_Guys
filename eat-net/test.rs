struct DatabaseConnInfo {
    driver: String,
    url: String,
    username: String,
    password: String,
    table: String,
}

trait PersistentStore<K, V> {
    fn database_conn_info() -> DatabaseConnInfo;

    fn insert(key: K, value: V) -> Result<(), EatNetError> {
        
    }

    fn remove(key: K) -> Result<Option<V>, EatNetError> {

    }

    fn get(key: K) -> Result<Option<V>, EatNetError> {

    }
}
