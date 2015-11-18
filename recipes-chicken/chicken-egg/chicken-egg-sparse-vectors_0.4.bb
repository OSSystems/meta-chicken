SECTION = "devel/chicken"
DESCRIPTION = "Arbitrarily large vectors"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://sparse-vectors.meta;md5=3638fac0fae5b70f38e1ec2742e23141"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sparse-vectors/sparse-vectors-${PV}.tar.gz"

SRC_URI[md5sum] = "581dae1a18713df61ce99b91f99ab47e"
SRC_URI[sha256sum] = "e1abe70cd369283acf9755a1b61b4b608890ce135b87b3b036601747dffba4ed"

S = "${WORKDIR}/sparse-vectors-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
