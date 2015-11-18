SECTION = "devel/chicken"
DESCRIPTION = "Procedure Decoration API"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://procedure-decoration.meta;md5=5e373b4651e3d26d9860765419cacec8"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-check-errors-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/procedure-decoration/procedure-decoration-${PV}.tar.gz"

SRC_URI[md5sum] = "a46f8d6f792e40a7f59f78e9e63a739a"
SRC_URI[sha256sum] = "d45c9855a6af0a23ceb6aa3001d4db58ff5bca2f080c525cef6c1c7d80df8bee"

S = "${WORKDIR}/procedure-decoration-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
