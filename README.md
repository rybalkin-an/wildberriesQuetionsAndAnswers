# wildberriesQuetionsAndAnswers
simple UI test

Для запуска теста установить:
- [Java 8](https://www.java.com/ru/download/help/windows_manual_download.html)
- [Maven](https://maven.apache.org/install.html)
- [Allure commandline](https://docs.qameta.io/allure/#_commandline)
- [Selenoid](https://aerokube.com/selenoid/latest/)

### Для лоакльного запуска теста выполнить:
```
mvn clean install
```
Для генерации отчета Allure выполнить команду:
```
allure serve путь_до_папки/allure_report/
```

### Для запуска теста в Docker контейнере:
1. Установить Docker https://www.docker.com/get-started
2. Cоздать образ с тестом командой
```
docker build https://github.com/rybalkin-an/wildberriesQuetionsAndAnswers.git -t myimg:latest
```
3. Скачать из docker репозитория образ с Chrome 59.0
```
docker pull selenoid/vnc:chrome_59.0
```
4. Скачать docker-compose.yaml
5. Из директория со скаченным файлом запустить тесты командой
```
docker-compose up
```
