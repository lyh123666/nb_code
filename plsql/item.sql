PROMPT Creating Table 'ITEM'

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE item';
EXCEPTION
  WHEN OTHERS THEN
    IF SQLCODE != -942 THEN
      RAISE;
    END IF;
END;

CREATE TABLE item
  (
    name    VARCHAR2(100) NOT NULL,
    sell_in NUMBER(6) NOT NULL,
    quality NUMBER(6) NOT NULL
  );
/

SHOW ERRORS;
