SECTION = "devel/chicken"
DESCRIPTION = "sqlite3 call-with-connection abstraction with timeout and finalizer"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://call-with-sqlite3-connection.meta;md5=99a18d5c956a2e7519dbad7c591bc890"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-sqlite3-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-sqlite3-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-sqlite3 chicken-egg-setup-helper-crosssdk chicken-egg-sqlite3-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-sqlite3 chicken-egg-setup-helper-cross chicken-egg-sqlite3-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-sqlite3"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/call-with-sqlite3-connection/call-with-sqlite3-connection-${PV}.tar.gz"

SRC_URI[md5sum] = "2e3405d91408aa119a382d363435e88f"
SRC_URI[sha256sum] = "7ce98d8703ffbda9cee87ada7c67499b0985f2c5923012caba975a38d096af84"

S = "${WORKDIR}/call-with-sqlite3-connection-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
