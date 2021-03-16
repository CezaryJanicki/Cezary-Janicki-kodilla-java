DROP PROCEDURE IF EXISTS UpdateBestsellers;

DELIMITER $$

CREATE PROCEDURE UpdateBestsellers()
BEGIN

    DECLARE BOOK_NO, BOOKS_READ INT;
    DECLARE FINISHED INT DEFAULT 0;
    DECLARE BOOKS CURSOR FOR SELECT BOOK_ID FROM RENTS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
    OPEN BOOKS;

    WHILE (FINISHED = 0) DO
        FETCH BOOKS INTO BOOK_NO;
        SELECT COUNT(*) FROM RENTS WHERE BOOK_ID = BOOK_NO INTO BOOKS_READ;
        IF (BOOKS_READ > 2) THEN
            UPDATE BOOKS SET BESTSELLER =TRUE WHERE BOOK_ID = BOOK_NO;
            COMMIT;
        END IF;
    END WHILE;
    CLOSE BOOKS;

END $$

DELIMITER ;

CALL UpdateBestsellers();
SELECT * FROM BOOKS;
