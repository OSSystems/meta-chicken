SECTION = "devel/chicken"
DESCRIPTION = "A mailbox constrained by capacity."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://pigeon-hole.meta;md5=0cac1707caedcc5c211f1d78e842e248"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pigeon-hole/pigeon-hole-${PV}.tar.gz"

SRC_URI[md5sum] = "f8c0aae6029103dae12e1f88da53e450"
SRC_URI[sha256sum] = "613cf7e62972f3fcc49d70c850a1ebd2c3a3cf1c85a9556ad3fd64ced9fcde6e"

S = "${WORKDIR}/pigeon-hole-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
