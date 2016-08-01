SECTION = "devel/chicken"
DESCRIPTION = "Load modules lazily"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://autoload.meta;md5=921a3e0f3eca2efb9d867f51b2b92a26"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/autoload/autoload-${PV}.tar.gz"

SRC_URI[md5sum] = "518612845b768882e1311aecbb205502"
SRC_URI[sha256sum] = "c5a52f63e14a1e8243fdb52a4161408a00d6fc4738001377ad62e15101a70837"

S = "${WORKDIR}/autoload-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
