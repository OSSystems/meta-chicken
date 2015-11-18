SECTION = "devel/chicken"
DESCRIPTION = "A convenience extension for representing SQL NULL values"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sql-null.meta;md5=9a9c9ec0ed1dc030a5255c0e494145aa"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sql-null/sql-null-${PV}.tar.gz"

SRC_URI[md5sum] = "ab8e89b2ba63e91a4f1ca65686376422"
SRC_URI[sha256sum] = "cf3ff31c9ac8b6a088fe3d6d831560c65e9caca04cc069908415416fde4177ac"

S = "${WORKDIR}/sql-null-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
