### Восстановление логов и настроек Kibana

Используется Elasticsearch 9.5.5. Выполняйте восстановление
при первом запуске проекта, в пустой volume.

1. Создать контейнеры и volume без запуска:

   ```bash
   docker compose create
   ```

2. Узнать имя volume Elasticsearch:

   ```bash
   docker volume ls
   ```

3. Восстановить данные, подставив имя своего volume:

   ```bash
   docker run --rm \
     -v ИМЯ_VOLUME:/data \
     -v "$PWD/backup:/backup:ro" \
     alpine:3.22 \
     tar -xzpf /backup/elasticsearch-data.tar.gz -C /data
   ```

4. Запустить сервисы:

   ```bash
   docker compose up -d
   ```

5. Открыть http://localhost:5601 и найти сохранённое
   представление Discover через поиск Kibana.
   Для просмотра архивных логов выбрать период их создания.