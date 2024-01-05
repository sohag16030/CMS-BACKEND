package com.cms.example.cms.feature.cmsUser;

import com.cms.example.cms.entities.CmsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsUserRepository extends JpaRepository<CmsUser, Long> {
}
