SECTION = "devel/chicken"
DESCRIPTION = "Spawn $EDITOR to update association list for CLI scripts"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://impromptu.meta;md5=f29b0790874ed02bb69f3da6534a28fe"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/impromptu/impromptu-${PV}.tar.gz"

SRC_URI[md5sum] = "551f5cc12adbca222a23aaf3da9bc576"
SRC_URI[sha256sum] = "bdabf8defd8c29114acf552b8a6281a92c5b18ebf1366785226ed0ad6e0ad95d"

S = "${WORKDIR}/impromptu-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
