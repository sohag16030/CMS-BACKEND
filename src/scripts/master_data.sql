-- INSERT DATA INTO DIVISION TABLE
INSERT INTO DIVISION (NAME, NAME_LOCAL, ACTIVE, CREATED_AT, UPDATED_AT) VALUES
                                                                            ('Dhaka', 'ঢাকা', TRUE, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                            ('Rajshahi', 'রাজশাহী', TRUE, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- INSERT DATA INTO DISTRICT TABLE
INSERT INTO DISTRICT (NAME, NAME_LOCAL, ACTIVE, DIVISION_ID, CREATED_AT, UPDATED_AT) VALUES
                                                                                         ('Dhaka', 'ঢাকা', TRUE, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                         ('Gazipur', 'গাজীপুর', TRUE, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                         ('Rajshahi', 'রাজশাহী', TRUE, 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                         ('Chapainawabganj', 'চাঁপাইনবাবগঞ্জ', TRUE, 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
-- INSERT DATA INTO UPAZILA TABLE
INSERT INTO UPAZILA (NAME, NAME_LOCAL, ACTIVE, DISTRICT_ID, CREATED_AT, UPDATED_AT) VALUES
                                                                                        -- UPAZILA UNDER DHAKA
                                                                                        ('Tangail Sadar', 'টাঙ্গাইল সদর', TRUE, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                        ('Sakhipur', 'সখিপুর', TRUE, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                        ('Basail', 'বাসাইল', TRUE, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),

                                                                                        -- UPAZILA UNDER CHAPAINAWABGANJ
                                                                                        ('Bholahat', 'ভোলাহাট', TRUE, 4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                        ('Gomastapur', 'গোমস্তাপুর', TRUE, 4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                        ('Nachole', 'নাচোল', TRUE, 4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                        ('Chapainawabganj Sadar', 'চাঁপাইনবাবগঞ্জ সদর', TRUE, 4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                                        ('Shibganj', 'শিবগঞ্জ', TRUE, 4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

--- INSERT DATA INTO RATING TABLE
INSERT INTO USER_RATING (STAR, RATING_TYPE) VALUES
                                                ('*', 'BRONZE'),
                                                ('**', 'SILVER'),
                                                ('***', 'GOLD'),
                                                ('****', 'PLATINUM'),
                                                ('*****', 'DIAMOND');
-- INSERT DATA INTO SUBJECT TABLE
INSERT INTO SUBJECT (SUBJECT_NAME, NAME_LOCAL, CREATED_AT, UPDATED_AT) VALUES
                                                                           ('Bangla', 'বাংলা', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                           ('English', 'ইংরেজি', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                           ('General Math', 'সাধারিত গণিত', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                           ('Higher Math', 'উচ্চতর গণিত', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                           ('ICT', 'তথ্য ও যোগাযোগ প্রযুক্তি', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                           ('Social Science', 'সামাজিক বিজ্ঞান', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
                                                                           ('General Science', 'সাধারিত বিজ্ঞান', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

