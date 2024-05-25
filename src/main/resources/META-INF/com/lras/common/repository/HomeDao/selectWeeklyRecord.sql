/*
サブクエリで日曜を起点として後ろ1週間の週間学習量を各曜日別に取得
*/

SELECT
    (SELECT COUNT(study_hour) FROM trn_StudyRecord WHERE study_datetime = DATE(STR_TO_DATE(/* date */'') - INTERVAL 6 DAY)) AS monday,
    (SELECT COUNT(study_hour) FROM trn_StudyRecord WHERE study_datetime = DATE(STR_TO_DATE(/* date */'') - INTERVAL 5 DAY)) AS tuesday,
    (SELECT COUNT(study_hour) FROM trn_StudyRecord WHERE study_datetime = DATE(STR_TO_DATE(/* date */'') - INTERVAL 4 DAY)) AS wednesday,
    (SELECT COUNT(study_hour) FROM trn_StudyRecord WHERE study_datetime = DATE(STR_TO_DATE(/* date */'') - INTERVAL 3 DAY)) AS thursday,
    (SELECT COUNT(study_hour) FROM trn_StudyRecord WHERE study_datetime = DATE(STR_TO_DATE(/* date */'') - INTERVAL 2 DAY)) AS friday,
    (SELECT COUNT(study_hour) FROM trn_StudyRecord WHERE study_datetime = DATE(STR_TO_DATE(/* date */'') - INTERVAL 1 DAY)) AS saturday,
    (SELECT COUNT(study_hour) FROM trn_StudyRecord WHERE study_datetime = DATE(STR_TO_DATE(/* date */''))) AS sunday
FROM
    trn_studyRecord
    